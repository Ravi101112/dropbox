import React from "react";
import { useParams } from "react-router-dom";

const FileViewPage = () => {
  const { filename } = useParams();

  return (
    <div className="container">
      <h2>Download File</h2>
      <a href={`http://localhost:8080/files/${filename}`} download>
        Click to Download: {filename}
      </a>
    </div>
  );
};

export default FileViewPage;
