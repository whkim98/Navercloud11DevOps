create sequence seq_test nocache;
drop table person;
create table person(
pnum number(3) constraint pk_pnum primary key,
pname varchar2(20),
pblood varchar2(5) default 'B',
page number(3),
ipsaday date
);

insert into person values(seq_test.nextval, '이상순', 'a', 34, '2010-12-20');
insert into person values(seq_test.nextval, '김우형', 'b', 27, '1998-10-01');
insert into person values(seq_test.nextval, '김유정', 'ab', 26, '1997-03-07');
insert into person values(seq_test.nextval, '이지은', 'a', 31, '1993-05-16');
insert into person values(seq_test.nextval, '유재석', 'o', 54, sysdate);
commit;

select * from person;

select pnum, pname, upper(pblood) pblood, page, to_char(ipsaday, 'yyyy-mm-dd') ipsaday from person;



