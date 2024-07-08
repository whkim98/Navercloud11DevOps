import React, { useState } from 'react';
import car1 from '../mycar13.png'

const FiveApp = () => {
    const [show, setShow] = useState(true);
    const [fname, setFname] = useState('Gamja Flower');
    const [fcolor, setFcolor] = useState('red');

    let message = "안녕ㅋ";
    return (
        <div>
            <h1 className='alert alert-danger'>FiveApp - 글꼴 변경</h1>
            <button type='button' className='btn btn-sm btn-info'
            onClick={()=>setShow(!show)}>show/hide</button>
            {
                show &&
                <img alt="car" src={car1} style={{width: '200px'}}/>
            }
            <hr/>
            <div style={{fontFamily: fname, color: fcolor, fontSize: '30px'}}>
                {message}
            </div>
            <h5>select 이벤트 활용 글꼴 변경</h5>
            <div className='input-group' style={{width: '300px'}}>
                <select className='form-select' style={{width: '120px'}}
                onChange={(e)=>setFname(e.target.value)}>
                    <option>East Sea Dokdo</option>
                    <option>Jua</option>
                    <option>Gaegu</option>
                    <option selected>Gamja Flower</option>
                    <option>Single Day</option>
                </select>
                &nbsp;
                <select className='form-select' style={{width: '120px'}}
                onChange={(w)=>setFcolor(w.target.value)}>
                    <option selected>red</option>
                    <option>green</option>
                    <option>orange</option>
                    <option>black</option>
                    <option>pink</option>
                </select>
            </div>
        </div>
    );
};

export default FiveApp;