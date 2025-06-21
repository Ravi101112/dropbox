# dropbox
dropbox
# 🚀 Dropbox Clone


A full-stack Dropbox-style cloud storage application that allows users to upload, view, and download files through a modern, dark-themed web interface.

---
<img width="500" alt="Screenshot 2025-06-21 at 8 25 31 PM" src="https://github.com/user-attachments/assets/53be548d-a49e-48dd-974f-6d7e2375349f" />
<img width="500" alt="Screenshot 2025-06-21 at 8 25 10 PM" src="https://github.com/user-attachments/assets/b9ea0f1a-a23d-4c19-bcb1-cd3bab7b02c1" />
<img width="500" alt="Screenshot 2025-06-21 at 7 34 27 PM" src="https://github.com/user-attachments/assets/7586e58f-4b26-492c-85df-1f962259f64f" />
<img width="500" alt="Screenshot 2025-06-21 at 7 34 52 PM" src="https://github.com/user-attachments/assets/401d1ead-caae-4d3a-8fce-741b42879731" />

## ✨ Features


- ✅ Upload multiple files
- 📁 View list of uploaded files
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
