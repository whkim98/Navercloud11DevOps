import { Alert, Button } from '@mui/material';
import React, { useRef, useState } from 'react';

const FourApp = () => {
    const [result, setResult] = useState('');
    const nameRef = useRef('');
    const korRef = useRef(0);
    const engRef = useRef(0);
    const resultButtonEvent = () => {
        let name = nameRef.current.value;
        let kor = korRef.current.value;
        let eng = engRef.current.value;

        let tot = Number(kor) + Number(eng);
        let avg = tot / 2;

        let s = `
이름: ${name}
국어점수: ${kor}
영어점수: ${eng}
총점: ${tot}
평균: ${avg}
        `;
        setResult(s);
        nameRef.current.value = "";
        korRef.current.value = "";
        engRef.current.value = "";
    }
    return (
        <div>
            <Alert>FourApp - useRef 응용</Alert>
            <table className='table table-bordered' style={{width: '300px'}}>
                <tbody>
                    <tr>
                        <th style={{width: '100px'}} className='table-info'>이름</th>
                        <td>
                            <input type='text' className='form-control' ref={nameRef}/>
                        </td>
                    </tr>
                    <tr>
                        <th style={{width: '100px'}} className='table-info'>국어점수</th>
                        <td>
                            <input type='text' className='form-control' ref={korRef}/>
                        </td>
                    </tr>
                    <tr>
                        <th style={{width: '100px'}} className='table-info'>영어점수</th>
                        <td>
                            <input type='text' className='form-control' ref={engRef}/>
                        </td>
                    </tr>
                    <tr>
                        <td colSpan={2} align='center'>
                            <Button variant='contained' color='error' onClick={resultButtonEvent}>
                                결과 출력
                            </Button>
                        </td>
                    </tr>
                    <tr style={{height: '100px'}}>
                        <td colSpan={2} style={{fontSize: '16px', whiteSpace: 'pre-line', backgroundColor: '#ffc'}}>
                            {result}
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    );
};

export default FourApp;