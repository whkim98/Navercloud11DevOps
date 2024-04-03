--시퀀스 생성
-- 1부터 1씩 증가하는 시퀀스는 생략하고 기본 명령어만 주면 됨
create sequence seq1;

select * from seq;

select seq1.nextval from dual;

--10부터 5씩 증가하는 시퀀스, 캐쉬 삭제
create sequence seq2 start with 10 increment by 5 nocache;

select seq2.nextval from dual;

--시퀀스 제거
drop sequence seq1;
drop sequence seq2;

commit;

create sequence seq_test nocache;

--테이블 생성
create table hello(
idx number(3) primary key,
name varchar2(20),
age number(3)
);

--테이블 구조 수정
alter table hello modify name varchar2(30);

alter table hello add addr varchar2(100);

alter table hello drop column age;

alter table hello rename column addr to address;

alter table hello add blood varchar2(3);

alter table hello add age number(3);

insert into hello (idx, name) values(seq_test.nextval, 'lee');
insert into hello(idx, blood, address) values(seq_test.nextval, 'b', '서울 역삼');

insert into hello values(seq_test.nextval, '이진', '제주도 애월읍', 'a', 23);

--수정
update hello set blood = 'ab' where name = '이진';

--idx가 2인 사람의 이름과 나이를 수정
update hello set name = '김우형', age = 27 where idx = 2;

update hello set address = '용인', blood = 'o', age = 33 where idx = 1;

--삭제
delete from hello where idx = 1;

delete from hello where age >= 30;

drop table hello;

select * from hello;

--제약 조건을 추가한 테이블 생성
create table student(
num number(3) constraint pk_num primary key,
stuname varchar2(20) constraint nn_name not null,
score number(3) constraint ck_score check(score >= 1 and score <= 100),
birthday date
);

insert into student(num, stuname) values(1, '김미리');
insert into student(stuname, score) values ('이미자', 45); --오류
insert into student(num, stuname) values(1, '홍진주'); --unique 오류
insert into student(num, stuname, score) values(2, '강호동', 110); --check 오류

insert into student values(3, '이미자', 89, sysdate);
insert into student values(4, '김민종', 100, '2010-12-20');
insert into student values(5, '곤미나', 56, '2019-05-10');
insert into student values(6, '강수지', 98, sysdate);
insert into student values(7, '김진우', 67, '2015-09-12');
insert into student values(8, '강호동', 66, '2019-05-03');

rollback;

select * from student;

update student set stuname = '손미라', score = 80 where num = 5;

update student set score = 85 where to_char(birthday, 'mm') = 5;

commit;