import React from 'react';
import { NavLink, Route, Routes } from 'react-router-dom';
import MyCarList from './MyCarList';
import MyCarPhoto from './MyCarPhoto';

const MyCar = () => {
    
    return (
        <div>
            <h2 className='alert alert-danger'>MyCar</h2>
            <ul className='menu'>
                <li>
                    <NavLink to={'/mycar/list'}>목록 #1</NavLink>
                </li>
                <li>
                    <NavLink to={'/mycar/photo'}>목록 #2</NavLink>
                </li>
            </ul>
            <div style={{marginTop: '20px', width: '400px'}}>
                <Routes>
                    <Route path='list' element={<MyCarList/>}/>
                    <Route path='photo' element={<MyCarPhoto/>}/>
                </Routes>
            </div>
        </div>
    );
};

export default MyCar;