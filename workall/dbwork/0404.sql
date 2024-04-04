show databases;

-- 날짜함수

select NOW() from dual;
select sysdate() from dual;
select CURRENT_TIMESTAMP() from dual; 

select year(NOW()) from dual;
select month(NOW()) from dual;
select MONTHNAME(NOW()) from dual;
select DAYNAME(NOW()) from dual;
select DAYOFMONTH(NOW()) from dual;
select DATE_FORMAT(NOW(), '%y-%m-%d') from dual;
select DATE_FORMAT(NOW(), '%Y-%m-%d %H:%i') from dual; 
select str_to_date(20240404, '%Y%m%d') from dual; --숫자를 날짜로

create table test01 (num tinyint auto_increment primary key,
      name varchar(20), age smallint,
     height decimal(5,1),birthday datetime, ipsaday date);
    
insert into test01(name, age, height) values('lee', 23, 178.9);
insert into test01 values(null, 'kim', 29, 156.9, now(), now());
insert into test01 values(null, 'son', 31, 167.888, now(), now());
insert into test01 values(null, 'sonaaa', 26, 177.9, now(), now());
insert into test01 values(null, 'kimbbb', 45, 183.9, now(), now());
insert into test01(name, birthday, ipsaday) values ('LeeMJ', '2021-12-25 12:30', '2018-05-10');

SELECT * from test01;
select * from test01 where name = 'son';
select * from test01 where name like 's%';
select * from test01 where name like '_i%';
select UPPER(name), height from test01; -- 이름 대문자
select LOWER(name), height from test01; 
select UCASE(name), height from test01; 
select LCASE(name), height from test01;

select name, IFNULL(age, 10), IFNULL(height, 150.5) from test01; 
select name "이름", IFNULL(age, 10) "나이", IFNULL(height, 150.5) 신장 from test01;

-- 테이블 구조 수정
ALTER table test01 add hp varchar(20);
alter table test01 add blood varchar(4) default 'B';
SELECT * from test01;

desc test01;

alter table test01 modify name varchar(30);

alter table test01 drop column age;

alter table test01 rename column hp to phone;

DELETE from test01 where num = 5;

select * from test01;

UPDATE test01 set birthday = '1990-12-12', ipsaday = NOW(), phone = '010-2222-3333' where num = 1; 

select * from test01 order by 1;

-- 부분 조회
select * from test01 limit 0, 3; -- 0번째부터 3개


create table sawon (
              num smallint auto_increment,
              name varchar(20),
              score smallint,
              gender varchar(10),
              buseo varchar(10),
              constraint pk_sawon_num primary key(num),
  		constraint ck_sawon_score check (score between 0 and 100),
 		constraint ck_sawon_gender check (gender in ('여자','남자')));
 	
-- 제약조건 확인
select * from information_schema.table_constraints where table_name = 'sawon';

insert into sawon values(null, '이민정', 90, '여자', '홍보부');
insert into sawon values(null, '홍길동', 87, '남자', '교육부');
insert into sawon values(null, '이제동', 47, '남자', '인사부');
insert into sawon values(null, '김우형', 100, '남자', '인사부');
insert into sawon values(null, '김유정', 98, '여자', '인사부');
insert into sawon values(null, '이지은', 23, '여자', '교육부');
insert into sawon values(null, '홍차', 65, '남자', '교육부');
insert into sawon values(null, '홍색', 88, '남자', '홍보부');
insert into sawon values(null, '김미자', 51, '여자', '교육부');

-- 그룹함수
select count(*) from sawon;
select sum(score), avg(score) from sawon;

-- 성별로 그룹 후 인원수 최고점수 최저점수 평균점수 
select gender, max(score), min(score), avg(score), count(*) from sawon group by gender;

-- 부서별 그룹
select buseo, count(*), MAX(score) from sawon group by buseo;

select name, score, if(score>=90, '통과', '재시험') 평가 from sawon;

drop table test01;

select concat('happy','day') from dual; /*문자열더함*/
select concat('apple','kiwi','mango') from dual;
select replace('have a nice day','a','*') from dual;
select instr('happy','a') from dual;
select instr('happy','x') from dual;
select left('have a nice day',4) from dual;
select right('have a nice day',5) from dual;
select mid('have a nice day',8,4) from dual;
select substring('have a nice day',8,4) from dual;
select left('가나다라마바사',3) from dual; /*한글도3글자 나옴*/
select substring('가나다라마바사',4,2) from dual;
select concat(ltrim('   abc    '),'*') from dual;
select concat(rtrim('   abc    '),'*') from dual;
select concat(trim('   abc    '),'*') from dual;
select lcase('Happy'),lower('Happy') from dual;
select ucase('Happy'),upper('Happy') from dual;
select reverse('Happy') from dual;
select abs(-10) from dual;/*무조건 양수값 반환*/
select ceiling(2.1) from dual; /*무조건올림  3 */
select floor(2.9) from dual; /*무조건내림  2 */
select truncate(2.345,2) from dual; /*소숫점2자리까지 출력되고 3자리에서 내림*/
select mod(5,3) from dual;/*5를 3으로 나눈나머지=2*/
select greatest(12,23,34,11,4) from dual;/*가장 큰숫자*/
select least(12,23,34,11,4) from dual;/*가장 작은숫자*/

SELECT * from sawon;

create table bitclass (
   idx smallint primary key,
   class varchar(30),
   price int,
   gigan smallint);

create table stu (
   num smallint auto_increment primary key,
   name varchar(20),
   idx smallint,
   sugangday date,
   constraint stu_fk_idx foreign key(idx) references bitclass(idx));

-- bitclass 에 데이타 추가
insert into bitclass values (100,'Java',110000,10);
insert into bitclass values (200,'HTML5',90000,8);
insert into bitclass values (300,'jQuery',130000,12);
insert into bitclass values (400,'Oracle',180000,20);

-- stu 에 데이타 추가
insert into stu (name,idx,sugangday) values ('kim',200,now());
insert into stu (name,idx,sugangday) values ('lee',100,now());
insert into stu (name,idx,sugangday) values ('son',300,now());
insert into stu (name,idx,sugangday) values ('min',400,now());

select * from bitclass bc,stu where bc.idx=stu.idx;

select name,class,price,gigan,sugangday from bitclass bc,stu
  where bc.idx=stu.idx;

select name,class,price,gigan,sugangday from bitclass bc 
	inner join stu on bc.idx=stu.idx;

drop table stu;
drop table bitclass;

create table shop(
shopnum smallint auto_increment primary key,
sangpum varchar(30),
price int,
color varchar(20) default 'black'
);

create table cart(
cartnum smallint auto_increment primary key,
username varchar(20),
shopnum smallint,
guipday datetime,
constraint fk_shopnum foreign key (shopnum) references shop(shopnum) on delete cascade
);

insert into shop(sangpum, price) values('블라우스', 12000);
insert into shop values(null, '청바지', 29000, 'blue');
insert into shop values(null, '레이스조끼', 31000, 'yellow');
insert into shop values(null, '주름스커트', 43000, 'green');
insert into shop values(null, '체크남방', 32000, 'pink');
select * from shop;

insert into cart values(null, '이진', 4, now());
insert into cart values(null, '강철수', 6, now());
insert into cart values(null, '유재석', 1, now());
insert into cart values(null, '김유정', 3, now());
select * from cart;

select s.shopnum, s.sangpum, s.price, s.color, c.username, c.guipday from shop s left join cart c on s.shopnum = c.shopnum;







