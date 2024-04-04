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

SELECT * from sawon;

