import React, { useState, useEffect } from "react";
import axios from "axios";
import { Link } from "react-router-dom";

const HomePage = () => {
  const [files, setFiles] = useState([]);
  const [file, setFile] = useState(null);

  useEffect(() => {
    axios.get("http://localhost:8080/files").then((res) => setFiles(res.data));
  }, []);

  const handleUpload = async () => {
    if (!file) return;
    const formData = new FormData();
    formData.append("file", file);
    await axios.post("http://localhost:8080/upload", formData);
    alert("Uploaded!");
    window.location.reload();
  };

  return (
    <div className="container">
      <h1>Dropbox Clone</h1>
      <input type="file" onChange={(e) => setFile(e.target.files[0])} />
      <button onClick={handleUpload}>Upload</button>
      <table>
        <thead>
          <tr>
            <th>Filename</th>
            <th>Type</th>
            <th>Size</th>
            <th>Uploaded</th>
          </tr>
        </thead>
        <tbody>
          {files.map((f, idx) => (
            <tr key={idx}>
              <td><Link to={`/files/${f.filename}`}>{f.filename}</Link></td>
              <td>{f.contentType}</td>
              <td>{(f.size / 1024).toFixed(2)} KB</td>
              <td>{f.uploadTime}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default HomePage;
