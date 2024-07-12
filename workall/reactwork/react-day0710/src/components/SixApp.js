import { Alert } from '@mui/material';
import React, { useState } from 'react';
import SixChild1App from './SixChild1App';

const SixApp = () => {
    const [count, setCount]=useState(0);
    const [array, setArray] = useState([
        {cname: "아우디", cphoto: "mycar15.png", cprice: '2300', color: "#afeeee"},
        {cname: "벤츠", cphoto: "mycar7.png", cprice: '3400', color: "#ffc0cb"},
        {cname: "제네시스", cphoto: "mycar12.png", cprice: '1700', color: "#e0ffff"},
        {cname: "그렌져", cphoto: "mycar11.png", cprice: '4200', color: "#40e0d0"}
    ]);

    const deleteCar = (idx) => {
        alert(idx);
    }

    const countIncre = () => setCount(count + 1);
    return (
        <div>
            <Alert>SixApp - 부모/자식 통신 #2</Alert>
            <Alert severity='error' style={{fontSize: '20px'}}>회원 방문 횟수: {count}회</Alert>
            <SixChild1App carname = "아반떼" carphoto = "mycar8.png" 
            bgcolor = "#ffc0cb" carprice = "3500" onIncre = {countIncre}/>
            <SixChild1App carname = "그렌져" carphoto = "mycar5.png" 
            bgcolor = "#7fffd4" carprice = "4700" onIncre = {countIncre}/>
            <hr/>
            <table className='tbstyle'>
                <thead>
                    <tr style={{backgroundColor: 'tomato'}}>
                        <th style={{width: '100px'}}>자동차명</th>
                    </tr>
                </thead>
            </table>
        </div>
    );
};

export default SixApp;