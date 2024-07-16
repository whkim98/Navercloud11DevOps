import React from 'react';
import Menu from './components/Menu';
import { Route, Routes } from 'react-router-dom';
import { About, Food, Home } from './pages';
import photo1 from './image/s5.JPG';
import photo2 from './image/s2.JPG';

const RouterMain = () => {
    return (
        <div>
            <Menu/>
            <hr style={{clear: 'both'}}/>
            <Routes>
                <Route path='/' element={<Home/>}></Route>


                <Route path='/food' element={<Food/>}>
                    <Route path=':food1' element={<Food/>}/>
                    <Route path=':food1/:food2' element={<Food/>}/>
                </Route>


                <Route path='/about' element={<About/>}/>
                <Route path='/login/*' element={
                    <div>
                        <h2>로그인 메뉴입니다</h2>
                        <img alt='' src={photo1}/>
                        <About/>
                    </div>
                }/>
                <Route path='*' element={
                    <div>
                        <h2>잘못된 페이지입니다</h2>
                        <img src={photo2} alt=''></img>
                    </div>
                }/>
            </Routes>
        </div>
    );
};

export default RouterMain;