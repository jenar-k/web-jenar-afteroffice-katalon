# 📘 QA Automation After Office Project - WEB UI TEST

### 👤 Introduction
Halo! Saya Jenar Kuswidiardi, seorang QA Automation enthusiast yang sedang mendalami pengujian perangkat lunak menggunakan **Katalon Studio Enterprise**. Saya percaya bahwa otomasi yang baik dapat meningkatkan kualitas dan efisiensi proses pengujian aplikasi.

### 🚀 Project Information
Proyek ini merupakan implementasi pengujian otomatis menggunakan **Katalon Studio Enterprise** untuk pengujian WEB UI secara automation.

Device:
- **Operating System**: Windows 11

Automation tools:

- **Tools**: Katalon Studio Enterprise
- **Versi yang Digunakan**: 10.2.1

### 🌐 Website
Website yang diuji dalam proyek ini adalah:  
**`https://demoqa.com/automation-practice-form`**

## ✅ Testcase
Berikut 10 skenario pengujian yang dilakukan pada proyek ini:

1. **TC01** - Failed_send_form_because_all_mandatory_fields_is_empty ✅
2. **TC02** - Failed_send_form_because_firstname_is_empty ✅
3. **TC03** - Failed_send_form_because_lastname_is_empty ✅
4. **TC04** - Failed_send_form_because_gender_is_empty ✅
5. **TC05** - Failed_send_form_because_phonenumber_is_empty ✅
6. **TC06** - Failed_send_form_because_phonenumber_less_than_10_digits ✅
7. **TC07** - Failed_sending_form_because_email_invalid_format ✅
8. **TC08** - Failed_sending_form_because_upload_invalid_attachment_format ❌
9. **TC09** - Success_sending_form_with_filled_in_mandatory_data_only ✅
10. **TC10** - Success_sending_form_and_verify_it ✅

### 🔬 Test Suite & Test Collection Information
Berikut beberapa skenario pengujian yang dilakukan:

1. test_suites_collection_colection_regression_all_function
   - Kumpulan seluruh test suites dengan berbagai tipe browser yang berbeda untuk menguji seluruh function berjalan dengan semestinya
2. test_suites_collection_regression_positive_case
   - Kumpulan test suites yang berisi testcase positive case dan di uji berbagai tipe browser yang berbeda guna memastikan seluruh function berjalan dengan semestinya
3. test_suites_collection_regression_negative_case
   - Kumpulan test suites yang berisi testcase negative case dan di uji berbagai tipe browser yang berbeda guna memastikan seluruh function berjalan dengan semestinya
4. test_suites_regression_all_function
   - Kumpulan seluruh test case baik itu testcase negative case dan testcase positive case yang dikelompokkan menjadi satu untuk diuji guna memastikan seluruh function berjalan dengan semestinya
5. test_suites_regression_positive_case
   - Kumpulan testcase positive case yang dikelompokkan menjadi satu untuk diuji guna memastikan seluruh function berjalan dengan semestinya
6. test_suites_regression_negative_case
   - Kumpulan testcase negative case yang dikelompokkan menjadi satu untuk diuji guna memastikan seluruh function berjalan dengan semestinya

## 📊 Report
Setelah dilakukan run pada automation yang saya buat, didapatkan hasil pengujian:

- **Passed: 90%**
- **Failed: 10%**

Hasil pengujian juga saya lampirkan dalam bentuk **gambar**/screenshot seperti berikut ini [Report_result](https://prnt.sc/APwk_934uNks) 

## ❌ Failed Reason and Solution ✅

Dari hasil pengujian, terdapat satu case yang **FAILED**. Case yang failed adalah **TC08 - Failed sending form because upload invalid attachment format**, dimana application under test masih dapat meng-upload attachment yang bukan format image. Expected dari testcase tersebut adalah application under test hanya dapat meng-upload attachment yang berformat image.

## 📌 Solusi

Solusi yang dapat dilakukan adalah melakukan followup ke engineer/ developer agar dilakukan fixing dengan QA memberikan saran sebagai berikut:

- **FrontEnd**: sebagai layer pertama pencegahan issue, developer perlu melakukan filtering dengan hanya menampilkan file berformat image.
- **BackEnd**: sebagai layer kedua pencegahan issue, developer perlu melakukan validasi jika format yang diupload oleh user bukan berformat image maka akan ditolak dan menampilkan alert message. Mengantisipasi jika user berhasil menemukan cara untuk mengupload attachment yang berformat bukan image.


## 📬 Contact Me
Jika ada pertanyaan atau kolaborasi, silakan hubungi saya:

- 📧 Email: [jenarkuswidiardi@gmail.com](mailto:jenarkuswidiardi@gmail.com)
- 💼 LinkedIn: [linkedin.com/in/jenar-kuswidiardi](https://www.linkedin.com/in/jenar-kuswidiardi/)
- 🌐 Portfolio: [my website](https://jenark.wixsite.com/jenar)
- 🗂️ Portfolio: [Portfolio Link](https://linktr.ee/jenar_k)

---

<h1> <p align="center"> 🙌 Terima kasih telah melihat proyek ini! 🙌 </p></h1> 
