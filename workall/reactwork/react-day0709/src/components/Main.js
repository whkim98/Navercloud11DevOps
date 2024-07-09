import React, { useState } from 'react';
import OneApp from './OneApp';
import TwoApp from './TwoApp';
import ThreeApp from './ThreeApp';
import FourApp from './FourApp';
import FiveApp from './FiveApp';
import SixApp from './SixApp';

const Main = () => {
    const [idx, setIdx] = useState(2);
    return (
        <div>
            <h3>2024-07-09</h3>
            <br/>
            <select className='form-select' style={{width: '300px'}}
            onChange={(e)=>setIdx(Number(e.target.value))}>
                <option value={1}>OneApp-styled-components</option>
                <option value={2} selected>TwoApp</option>
                <option value={3}>ThreeApp</option>
                <option value={4}>FourApp</option>
                <option value={5}>FiveApp</option>
                <option value={6}>SixApp</option>
            </select>
            <br/>
            {
                idx === 1 ? <OneApp/> : idx === 2 ? <TwoApp/> : idx === 3 ? <ThreeApp/> :
                idx === 4 ? <FourApp/> : idx === 5 ? <FiveApp/> : <SixApp/>
            }
        </div>
    );
};

export default Main;