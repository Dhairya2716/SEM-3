import { Link, Outlet } from 'react-router-dom';

export default function Layout(){
    return (
        <>
        <Link to="/Home">Home</Link>
        <Link to="/About">About</Link>
        <Link to="/Contact">Contact</Link>
        <Outlet />
        </>
    )
}