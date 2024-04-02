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