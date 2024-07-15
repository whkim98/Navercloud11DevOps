import { Alert, Button } from '@mui/material';
import axios from 'axios';
import React, { useEffect, useState } from 'react';
import MyCarRowItem from './MyCarRowItem';
import MyCarWriteForm from './MyCarWriteForm';


const MyCarList = () => {
    const [list, setList] = useState([]);
    const [show, setShow] = useState(false);

    const myCarList = () => {
        axios.get("/mycar/list")
        .then(res => {
            setList(res.data);
        });
    }

    useEffect(() => {
        myCarList();
    }, []);

    return (
        <div>
            <Button variant='contained' color='info' onClick={() => setShow(!show)}>자동차 등록 show/hide</Button>
            {
                show &&
                <MyCarWriteForm/>
            }
            <Alert severity='success' style={{fontSize: '15px', width: '500px'}}>
                <b>총 {list.length}개의 정보가 있습니다</b>
            </Alert>
            <table className='table table-bordered' style={{width: '500px'}}>
                <thead>
                    <tr className='table-danger'>
                        <th style={{width: '150px'}}>자동차명</th>
                        <th style={{width: '100px'}}>가격</th>
                        <th style={{width: '60px'}}>색상</th>
                        <th style={{width: '120px'}}>구입일</th>
                        <th style={{width: '120px'}}>등록일</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        list.map((row, idx) =>
                            <MyCarRowItem key={idx} idx={idx} row={row}/>)
                    }
                </tbody>
            </table>
        </div>
    );
};

export default MyCarList;