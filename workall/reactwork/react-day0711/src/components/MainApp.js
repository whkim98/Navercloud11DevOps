import React, { useState } from 'react';
import OneApp from './OneApp';
import TwoApp from './TwoApp';
import ThreeApp from './ThreeApp';
import FourApp from './FourApp';
import Root from '../context/Root';
import FiveApp from './FiveApp';

const MainApp = () => {
    const [idx,setIdx]=useState(5);

    const changeApp=(e)=>{
        setIdx(Number(e.target.value));
    }
    return (
        <div>
            <h2>2024-07-11,12 리액트 수업</h2>
            <div style={{fontSize:'16px'}}>
                <label>
                    <input type='radio' name='app' defaultValue={1}
                    onClick={changeApp}/>OneApp-모든 입력값 하나의 변수에 넣기
                </label>                       
                <br/>
                <label>
                    <input type='radio' name='app' defaultValue={2}
                    onClick={changeApp}/>TwoApp-데이타 추가,삭제,출력(부모,자식컴포넌트)
                </label>
                <br/>
                <label>
                    <input type='radio' name='app' defaultValue={3}
                    onClick={changeApp}/>ThreeApp-json 데이타 출력
                </label>
                <br/>
                <label>
                    <input type='radio' name='app' defaultValue={4}
                    onClick={changeApp}/>FourApp-json 데이타 읽기 문제
                </label> 
                <br/> 
                <label>
                    <input type='radio' name='app' defaultValue={5}
                    onClick={changeApp}/>Root-useContext 공부
                </label> 
                <br/>
                <label>
                    <input type="radio" name='app' defaultValue={6}
                    onClick={changeApp}/>FiveApp-Axios db데이터 가져오기    
                </label>                        
            </div>
            <hr/>
            {
                idx===1?<OneApp/>:idx===2?<TwoApp/>:
                idx===3?<ThreeApp/>:idx===4?<FourApp/>:
                idx===5?<Root/>:<FiveApp/>
            }
        </div>
    );
};

export default MainApp;