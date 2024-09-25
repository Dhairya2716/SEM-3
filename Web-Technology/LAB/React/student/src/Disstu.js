import React, { useState } from "react";

export default function Distu() {
  const [student, setStudent] = useState([]);
  const [data, setData] = useState({});
  const [editing, setEditing] = useState(null);

  const handleEdit = (index) => {
    setEditing(index);
    setData(student[index]);
  };

  const handleSave = (index) => {
    const updatedStudent = [...student];
    updatedStudent[index] = data;
    setStudent(updatedStudent);
    setEditing(null);
  };

  const handleDelete = (index) => {
    const updatedStudent = [...student];
    updatedStudent.splice(index, 1);
    setStudent(updatedStudent);
  };

  return (
    <>
      <h1>Name :</h1>
      <input
        type="text"
        placeholder="Enter your name"
        id="name"
        value={data.Name}
        onChange={(e) => {
          setData({ ...data, Name: e.target.value });
        }}
      />
      <h1>Sem :</h1>
      <input
        type="text"
        placeholder="Enter your sem"
        id="sem"
        value={data.Sem}
        onChange={(e) => {
          setData({ ...data, Sem: e.target.value });
        }}
      />
      <button
        onClick={() => {
          setStudent([...student, data]);
          setData({}); 
        }}
      >
        add
      </button>
      <h2>Student List:</h2>
      <ul>
        {student.map((item, index) => (
          <li key={index}>
            {editing === index ? (
              <>
                <input
                  type="text"
                  value={data.Name}
                  onChange={(e) => {
                    setData({ ...data, Name: e.target.value });
                  }}
                />
                <input
                  type="text"
                  value={data.Sem}
                  onChange={(e) => {
                    setData({ ...data, Sem: e.target.value });
                  }}
                />
                <button onClick={() => handleSave(index)}>Save</button>
              </>
            ) : (
              <>
                Name: {item.Name}, Sem: {item.Sem}
                <button onClick={() => handleEdit(index)}>Edit</button>
                <button onClick={() => handleDelete(index)}>Delete</button>
              </>
            )}
          </li>
        ))}
      </ul>
    </>
  );
}