import { useEffect, useState } from "react";
import useParams from "react-router-dom";
const format = () =>{
    const Bank =  [
        {id:1, name:"Bank of America", location:"New York"},
        {id:2, name:"Bank of America", location:"Los Angeles"},
    ]
    return Bank;
}
const Bank = () => {
    const [bank, setBank] = useState([]);
    const {id} = useParams();
    useEffect(() => {
        const fetchBank = async () => {
            const response = await fetch(`https:localhost:3000${id}`);
            const data = await response.json();
            setBank(data);
            };
            fetchBank();
            }, [id]);
            return (
                <div>
                    <h1>Bank Details</h1>
                    <ul>
                        {bank.map((item) => (
                            <li key={item.id}>
                            <h2>{item.name}</h2>
                            <p>Location: {item.location}</p>
                        </li>
                    ))}
                </ul>
            </div>
        );
    }
export default Bank;