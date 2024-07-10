import React, { useState } from 'react';
import OneApp from './OneApp';
import TwoApp from './TwoApp';
import ThreeApp from './ThreeApp';
import FourApp from './FourApp';
import FiveApp from './FiveApp';
import SixApp from './SixApp';

const MainApp = () => {
    const [idx, setidx] = useState(6);
    const changeApp = (e) => {
        setidx(Number(e.target.value));
    }
    return (
        <div>
            <h2>2024-07-10</h2>
            <div style={{fontSize: '16px'}}>
                <label>
                    <input type="radio" name="app" defaultValue={1}
                    onClick={changeApp}/>OneApp - 배열 추가, 삭제
                </label>
                <br/>
                <label>
                    <input type="radio" name="app" defaultValue={2}
                    onClick={changeApp}/>TwoApp - 배열 추가, 삭제 문제
                </label>
                <br/>
                <label>
                    <input type="radio" name="app" defaultValue={3}
                    onClick={changeApp}/>ThreeApp - 배열 추가, 삭제
                </label>
                <br/>
                <label>
                    <input type="radio" name="app" defaultValue={4}
                    onClick={changeApp}/>FourApp - 배열 추가, 삭제
                </label>
                <br/>
                <label>
                    <input type="radio" name="app" defaultValue={5}
                    onClick={changeApp}/>FiveApp - 배열 추가, 삭제
                </label>
                <br/>
                <label>
                    <input type="radio" name="app" defaultValue={6}
                    onClick={changeApp}/>SixApp - 배열 추가, 삭제
                </label>
                <br/>
            </div>
            <hr/>
            {
                idx === 1 ? <OneApp/> : idx === 2 ? <TwoApp/> : idx === 3 ? <ThreeApp/> :
                idx === 4 ? <FourApp/> : idx === 5 ? <FiveApp/> : <SixApp/>
            }
        </div>
    );
};

export default MainApp;