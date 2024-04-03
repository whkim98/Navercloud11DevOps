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

update hello set blood = 'ab' where name = '이진';

select * from hello;

commit;