import React from 'react';

const FiveRowItem = ({mycar}) => {
    const storage = "https://kr.object.ncloudstorage.com/bitcamp-whkim-123/mycar/";

    return (
        <>
            <tr>
                <td style={{width: '200px'}} align='center' rowSpan={5}>
                    <img alt="photo" style={{width: '180px'}}
                    src={`${storage}${mycar.carphoto}`}/>
                </td>
                <td>자동차명: {mycar.carname}</td>
            </tr>
            <tr>
                <td>가격: {mycar.carprice}</td>
            </tr>
            <tr>
                <td style={{backgroundColor: mycar.carcolor}}>색상: {mycar.carcolor}</td>
            </tr>
            <tr>
                <td>구입날짜: {mycar.carguip}</td>
            </tr>
            <tr>
                <td>등록일: {mycar.writeday}</td>
            </tr>
        </>
    );
};

export default FiveRowItem;