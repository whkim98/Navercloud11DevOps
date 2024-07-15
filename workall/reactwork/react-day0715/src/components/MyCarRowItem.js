import { DeleteForeverOutlined } from '@mui/icons-material';
import React from 'react';

const MyCarRowItem = ({idx, row}) => {
    const photopath1 = "https://ph9dc3ti3779.edge.naverncp.com/PxOjfBhSlM/mycar";
    const photopath2 = "?type=f&w=40&h=40&faceopt=true&ttype=jpg";
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
                    <DeleteForeverOutlined style={{cursor: 'pointer'}}/>
                </span>
            </td>
        </tr>
    );
};

export default MyCarRowItem;