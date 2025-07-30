# meditrack (Medical Tracking Project)
![WhatsApp Image 2025-07-30 at 21 23 58_9c175e6b](https://github.com/user-attachments/assets/7a8a774f-510b-4799-9231-990dbc884b58)

## Anggota kelompok:
- Daniel Laira Pratama (20220801538)
- Defira Patricia (20220801539)
- Jeremy Steven Due Stanis (20220801540)

### Getting Started
Arsitektur Aplikasi "MediTrack"

Aplikasi MediTrack dibangun dengan Flutter (untuk UI) dan menggunakan Firebase (untuk backend).

Alur Utama:

    Aplikasi menginisialisasi Firebase saat dimulai.

    AuthWrapper memeriksa status login dan peran pengguna (biasa atau admin) dari Firebase Authentication dan Cloud Firestore.

    Berdasarkan peran, pengguna diarahkan ke DashboardPage (pengguna) atau AdminDashboardPage (admin).

Fungsionalitas Pengguna:

    LoginPage & RegisterPage: Mengelola proses masuk dan pendaftaran akun.

    DashboardPage memiliki:

        HomeTab: Untuk menambahkan catatan medis dan melihat grafik tren kesehatan (tekanan darah, detak jantung, glukosa) dari data Firestore.

        ProfileTab: Untuk melihat dan memperbarui informasi profil pengguna di Firestore.

        LogoutTab: Untuk keluar dari akun.

Fungsionalitas Admin:

    AdminDashboardPage memiliki:

        AdminUserManagementTab: Untuk mengelola (melihat, mencari, mengedit, menghapus) data pengguna di Firestore.

        AdminMedicalRecordsTab: Untuk mengelola (melihat, mencari, menghapus) semua catatan medis di Firestore.

Teknologi Utama:

    Flutter: Framework pengembangan aplikasi.

    Firebase Authentication: Untuk otentikasi pengguna.

    Cloud Firestore: Database NoSQL untuk menyimpan data pengguna dan catatan medis.

    Syncfusion Flutter Charts: Untuk visualisasi data tren medis.

    StreamBuilder & FutureBuilder: Untuk pembaruan data real-time.

Aplikasi ini menyediakan sistem manajemen kesehatan pribadi dengan dua tingkat akses (User dan admin), sepenuhnya didukung oleh Firebase.

####Inspirate By:
https://github.com/dc-exe/Health_and_Doctor_Appointment.git
