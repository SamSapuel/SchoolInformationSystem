# School information system
## 1.Project introduction
The system is a simplified analogy of KOS(CTU information system), which supports adding courses, viewing and editing. Teachers can create a course and select classrooms for it. Students can view the courses they are attending. Teachers, in turn, can view the courses they teach. At the end of the course, teachers can give marks for the course that the students have completed.

## 2.Description
### 2.1.Users and their functions.
There are 4 types of users in the system. Basically, 2 roles will be used: Student and Teacher.
Admin will be able to edit all data and assign roles.
The User role exists only before the admin assigns the role.<br>
• Student<br>
Students can sign up for the course, create their own schedule and book courses for the next semester. Students will be informed about the news<br>
• Teacher<br>
Teachers can create a course that is automatically enrolled in their schedule, and their functions also include reporting and student evaluation<br>
• Admin<br>
Admin assigns roles (student, teacher) to registered users and confirms the creation of the message.
### 2.2.UML class diagram(not final)
![diagram](https://sun9-39.userapi.com/impg/kEK56ScnyRiDKI8x6d27hgD2SMLZKIsNwsF9Bw/_Em27GrEOP4.jpg?size=974x750&quality=96&sign=908343578a03673681c3712d52271090&type=album)
### 2.3.System Limitations
As part of our project, it will not be possible to create a flexible schedule, although this can be done in KOS, for example.
### 2.4.Software information
As part of the semester project, this system will be implemented as a backend application in Java, using SpringBoot. The application will be connected to the PostgreSQL relational database and it will be possible to communicate with it via HTTP queries
