import { DeleteForeverOutlined } from '@mui/icons-material';
import axios from 'axios';
import React, { useState } from 'react';
import MyCarList from './MyCarList';

const MyCarRowItem = ({idx, row, onDelete}) => {
    const photopath1 = "https://ph9dc3ti3779.edge.naverncp.com/PxOjfBhSlM/mycar";
    const photopath2 = "?type=f&w=40&h=40&faceopt=true&ttype=jpg";

    // const [num, setNum] = useState(0);
    const deleteDataEvent = (num) => {
        let a = window.confirm("해당 상품을 삭제할까요?");
        if(a){
            onDelete(num);
        }
    }

    return (
        <tr style={{fontSize: '14px'}}>
            <td>
                <img alt="photo" src={`${photopath1}/${row.carphoto}${photopath2}`}
                border='1'/>
                <span style={{marginLeft: '5px'}}>{row.carname}</span>
            </td>
            <td align='right'>{row.carprice}만원</td>
            <td>
                <div style={{backgroundColor: row.carcolor, width: '30px', height: '30px'}}>
                </div>
            </td>
            <td>{row.carguip}</td>
            <td>
                <span style={{color: 'gray', fontSize: '13px'}}>
                    {row.writeday}
                    &nbsp;
                    <DeleteForeverOutlined style={{cursor: 'pointer'}} 
                    onClick={() => deleteDataEvent(row.num)}/>
                </span>
            </td>
        </tr>
    );
};

export default MyCarRowItem;