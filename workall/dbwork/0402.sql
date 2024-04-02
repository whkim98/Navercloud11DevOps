select * from emp;

select * from emp order by empno;

select distinct job from emp order by job asc; -- a, b, c 순서
select distinct job from emp order by 1; -- 컬럼번호 1부터

select * from emp where ename = 'SMITH';
select * from emp where ename = 'ward'; -- SQL명령어는 대소문자 구분을 안 하지만
                                        -- 데이터는 정확히 써야 함
select * from emp where ename = 'SMITH' or ename = 'WARD';

select ename "사원명", sal "급여" from emp;

select '내 이름은 ' ||ENAME||'이고 직업은 '||JOB||'입니다' from emp;

select ENAME||'님의 연봉은 '||SAL||'만원 입니다.' 연봉 from emp;

-- SAL이 2000 ~ 3000조회
select ename, sal from emp where sal >= 2000 and sal <= 3000;

select ename, sal from emp where sal between 2000 and 3000;

--직업이 SALESMAN이거나 MANAGER이거나 CLERK
select ename, job from emp where job = 'SALESMAN' or job = 'CLERK' or job = 'MANAGER';

select ename, job from emp where job in ('SALESMAN', 'MANAGER', 'CLERK');

select ename, job, mgr from emp where mgr in(7902, 7839, 7788);

select * from emp where mgr is null;
select * from emp where comm is null;
select * from emp where mgr is null and comm is null;

select * from emp where comm is not null;

select ename, sal from emp where ename like 'A%';
select ename, sal from emp where ename like '%N';

select ename, sal from emp where ename like '__A%';

--이름이 S나 M으로 시작하는 사람
select ename, sal from emp where ename like 'S%' or ename like 'M%';

--이름이 S로 시작하는 사람 중 연봉이 2000이상
select ename, sal from emp where ename like 'S%' and sal >= 2000;

--MGR이 7902, 7788, 7566이 아닌 사람 조회
select ename, sal from emp where mgr not in(7902, 7788, 7566);

--COMM, COMM + 1000의 결과 출력
select comm, comm + 1000 from emp; --null과의 연산은 모두 Null이 출력

--함수중 nvl
select nvl(comm, 0), nvl(comm, 0) + 1000 from emp;

select nvl(comm, 0) COMM, nvl(comm, 0) + 1000 COMM2 from emp;

--sal 이 2000 ~ 3000이 아닌 경우
select ename, sal from emp where sal not between 2000 and 3000;
select ename, sal from emp where sal > 3000 or sal < 2000;

select count(*) from emp;
select max(sal) from emp;
select min(sal) from emp;
select sum(sal) from emp;

select round(avg(sal), 1) from emp;
select ceil(avg(sal)) from emp;
select floor(avg(sal)) from emp;

select job 직업, count(*) 인원수 from emp 
group by job having count(*) >= 2 order by 2 asc;

--직업별 인원수와 최고연봉, 최저연봉, 평균연봉(올림)
select job 직업, count(*) 인원수, max(sal)최고연봉, min(sal)최저연봉, ceil(avg(sal)) 평균연봉 
from emp group by job;

--having은 group by절에서 조건에 사용
--직업별 인원수와 최고연봉을 구하는데 인원수가 3명이상인 경우
select job 직업, max(sal), count(*) from emp 
group by job having count(*) >= 3;

--날짜
select sysdate from dual;
select sysdate + 30 from dual;

select ename, to_char(hiredate, 'MONTH') from emp;