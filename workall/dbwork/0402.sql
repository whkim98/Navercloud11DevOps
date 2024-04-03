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
select ename, sal, mgr from emp where mgr not in(7902, 7788, 7566);

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
group by job having count(job) >= 3 order by 2;

--직업별 인원수와 최고연봉, 최저연봉, 평균연봉(올림)
select job 직업, count(*) 인원수, max(sal)최고연봉, min(sal)최저연봉, ceil(avg(sal)) 평균연봉 
from emp group by job;

--having은 group by절에서 조건에 사용
--직업별 인원수와 최고연봉을 구하는데 인원수가 3명이상인 경우
select job 직업, max(sal), count(*) from emp 
group by job having count(*) >= 3;

--날짜
select sysdate from dual;
select sysdate + 3 from dual;

select ename, to_char(hiredate, 'MONTH') from emp;

select to_char(sysdate, 'yyyy') from dual;
select to_char(sysdate, 'year') from dual; --잘 안 씀

select to_char(sysdate, 'yyyy-mm-dd') from dual;
select to_char(sysdate, 'YYYY-MM-DD PM HH24:MI') from dual;

select ename from emp where to_char(hiredate, 'yy') = 80;
select ename from emp where to_char(hiredate, 'mm') = 05;

--서브쿼리
select empno, ename from emp where sal = (select sal from emp where ename = 'SCOTT');
select empno, ename, job, sal from emp where sal > (select avg(sal) from emp);

--문제 1: 직업별 평균 급여 조회
--"EMP" 테이블에서 각 직업(JOB)별로 평균 급여(SAL)를 계산하세요. 결과는 평균 급여가 높은 순으로 정렬하고, 평균 급여 컬럼의 제목을 "평균 급여"로 표시하세요.

--문제 2: 특정 직업을 가진 사원 조회
--"EMP" 테이블에서 직업이 'MANAGER' 또는 'CLERK'인 모든 사원의 이름(ENAME), 직업(JOB), 그리고 관리자 번호(MGR)를 조회하세요. 결과는 사원 이름으로 오름차순 정렬하세요.

--문제 3: 특정 기간 동안 고용된 사원 조회
--"EMP" 테이블에서 1981년 1월 1일부터 1983년 12월 31일 사이에 고용된 모든 사원의 이름(ENAME), 고용 날짜(HIREDATE), 그리고 급여(SAL)를 조회하세요. 고용 날짜를 기준으로 오름차순 정렬하세요.

--문제 4: 최고 급여와 최저 급여 사이의 차이
--"EMP" 테이블에서 최고 급여(MAX(SAL))와 최저 급여(MIN(SAL))의 차이를 계산하세요. 결과 컬럼의 제목을 "급여 차이"로 표시하세요.

--문제 5: 특정 관리자 아래에서 일하는 사원 조회
--"EMP" 테이블에서 관리자 번호(MGR)가 7902, 7839, 또는 7788인 사원들 중에서 급여(SAL)가 2000 이상인 사원의 이름(ENAME), 직업(JOB), 급여(SAL)를 조회하세요. 결과는 급여가 높은 순으로 내림차순 정렬하세요.

select job 직업, round(avg(sal), 1) 평균급여, count(*) from emp group by job order by avg(sal) desc;
select ename, job, mgr from emp where job in ('MANAGER', 'CLERK') order by ename;
select ename, hiredate, sal from emp where hiredate >= '81-01-01' and hiredate <= '83-12-31' order by hiredate;
select max(sal) - min(sal) 급여차이 from emp;
select ename, job, sal from emp where mgr in (7902, 7839, 7788) and sal >= 2000 order by sal desc;
select ename, job, sal from (select * from emp where mgr in (7902, 7839, 7788)) where sal >= 2000;

--문제 1: 평균 급여보다 많이 받는 사원 찾기
--"EMP" 테이블에서 전체 사원의 평균 급여보다 많이 받는 사원들의 이름(ENAME), 급여(SAL)를 조회하세요.
--결과는 급여 순으로 내림차순 정렬하세요.

--문제 2: 특정 사원보다 급여를 많이 받는 사원 찾기
--'KING' 사원과 동일한 급여를 받는 사원들이 아닌, 
--'KING' 사원보다 더 많은 급여를 받는 사원들의 이름(ENAME), 급여(SAL)를 조회하세요. 
--결과는 급여 순으로 내림차순 정렬하세요.

--문제 3: 특정 부서에서 일하는 사원 중 최고 급여 받는 사원 찾기
--'30' 부서에서 일하는 사원들 중에서 최고 급여를 받는 사원의 이름(ENAME), 부서 번호(DEPTNO), 
--그리고 급여(SAL)를 조회하세요. 이때, 최고 급여는 서브쿼리를 사용하여 해당 부서의 최고 급여를 먼저 찾은 후, 
--그 급여를 받는 사원을 찾으세요.

--문제 4: 관리자가 아닌 사원 찾기
--관리자(MGR)로 등록되어 있지 않은 사원들의 이름(ENAME)과 직업(JOB)을 조회하세요. 
--여기서 관리자가 아니라는 것은, 해당 사원의 사원 번호(EMPNO)가 다른 사원의 관리자 번호(MGR)로 
--등록되어 있지 않음을 의미합니다.

--문제 5: 특정 연도에 고용된 사원 중 최고 연봉을 받는 사원 찾기
--1981년에 고용된 사원들 중에서 최고 급여를 받는 사원의 이름(ENAME), 고용 날짜(HIREDATE), 
--그리고 급여(SAL)를 조회하세요. 최고 급여는 서브쿼리를 사용하여 1981년에 고용된 사원들의 급여 중 최대값을
--먼저 찾은 후, 그 급여를 받는 사원을 찾으세요.

select ename, sal
from emp
where sal > (select avg(sal) from emp)
order by sal desc;

select ename, sal from emp where sal > 
(select sal from emp where ename = 'JAMES');

select ename, deptno, sal from emp 
where deptno = 30 and sal = (select max(sal)
from emp where deptno = 30);

select ename, job from emp where 
empno not in (select mgr from emp where mgr is not null);

select ename, hiredate, sal 
from emp where to_char(hiredate, 'yy') = 81 
and sal = (select max(sal) from emp 
where to_char(hiredate, 'yy') = 81);

