# dropbox
dropbox
# 🚀 Dropbox Clone


A full-stack Dropbox-style cloud storage application that allows users to upload, view, and download files through a modern, dark-themed web interface.

---

## ✨ Features
<img width="1440" alt="Screenshot 2025-06-21 at 7 52 27 PM" src="https://github.com/user-attachments/assets/bfec7ec1-59a1-4b3f-8c94-5e322d89cbfd" />

- ✅ Upload multiple files
- 📁 View list of uploaded files<img width="1417" alt="Screenshot 2025-06-01 at 5 31 33 PM" src="https://github.com/user-attachments/assets/8c5dbe8b-258b-4313-9f7c-455f25f589f0" />
<img width="1411" alt="Screenshot 2025-06-21 at 7 34 52 PM" src="https://github.com/user-attachments/assets/9e688c21-5f59-4cd3-baa4-f1b4574d2f0a" />

- ⬇️ Download files anytime
- 🖥️ React-based classy UI (CloudNext-inspired)
- 🔙 REST API with Spring Boot
- 🗄️ MySQL for persistent storage

---

## 🛠 Tech Stack

### Frontend
- React (Vite)
- Tailwind CSS / Custom CSS
- Axios for API communication

### Backend
- Spring Boot (Java)
- Spring MVC, Spring Data JPA
- MySQL Database

---

## 📁 Project Structure

dropbox-clone/
├── backend/ # Spring Boot backend
│ └── src/main/java/com/example/dropboxclone
│ └── application.properties
├── frontend/ # React frontend (port 5173)
│ └── index.html, App.jsx, styles, etc.


Start the backend:

bash
Copy
Edit
cd backend
./mvnw spring-boot:run

2️⃣ Frontend Setup (React)
bash
Copy
Edit
cd frontend
npm install
npm run dev
App will run at: http://localhost:5173
