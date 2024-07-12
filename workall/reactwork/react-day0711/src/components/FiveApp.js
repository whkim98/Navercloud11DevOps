import { Alert } from '@mui/material';
import Axios from 'axios';
import React, { useEffect, useState } from 'react';
import FiveRowItem from './FiveRowItem';

const FiveApp = () => {
    const [mycarlist, setMyCarList] = useState([]);
    //백에서 마이카 목록 가져오기
    const list = () => {
        Axios.get("/mycar/list")
        .then(res => {
            setMyCarList(res.data);
        });
    }

    //첫 로딩시 목록 가져오기
    useEffect(() => {
        list();
    }, []); //[]적으면 처음 한 번만 호출

    return (
        <div>
            <Alert>FiveApp-Axios db데이터 가져오기</Alert>
            <Alert severity='info'>총 {mycarlist.length}개의 자동차 정보가 있습니다</Alert>
            <table className='table table-bordered' style={{width: '400px'}}>
                <tbody>
                    {
                        mycarlist.map((mycar, idx) => 
                        <FiveRowItem mycar = {mycar} key = {idx}/>)
                    }
                </tbody>
            </table>
        </div>
    );
};

export default FiveApp;