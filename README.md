# konada-java-server

## 1. Install Docker:
 * Download and install Docker from the official website (https://www.docker.com/).
 * Ensure that the installed Docker version is 8.0 or higher by running the command docker --version in your terminal or command prompt.

## 2. Download and Install MySQL Workbench:
 * Go to the official MySQL website (https://www.mysql.com/) and download MySQL Workbench.
 * Follow the installation instructions to install MySQL Workbench on your system.

## 3. Navigate to the Directory with Docker Compose File:
 * Open a command prompt (cmd).
 * Use the cd command to navigate to the directory where your Docker Compose file is located.

## 4. Clone the Konada-java-server Repository:
 * Open a terminal or command prompt.
 * Use the git clone command to clone the Konada-java-server repository.
    - git clone https://github.com/HanKyungSung/konada-java-server.git

## 5. Navigate to the Directory with docker-compose.yml:
 * Open a terminal or command prompt.
 * Use the cd command to navigate to the directory containing your docker-compose.yml file.
 * Once you're in the directory containing docker-compose.yml, you can run the following command 
 to bring up the services with the project name 'kon'
 * docker-compose --project-name kon up -d

 #### After up to this section, follow the instruction for making "mysql_auth" container (very important) 

 * Open the terminal or command prompt.
 * Find the directory Dockerfile is included(It is in utils)
 * Write the command for making build image with Dockerfile
 * docker build -t mysql_auth .

 <img src="utils/images/5-1.png" alt="default" width="600" height="200">

 * Image with the sql files are generated on the docker
 * To make a port and container, write the following command
 * docker run -d -p 3307:3306 --name mysql_auth mysql_auth
 
 <img src="utils/images/5-2.png" alt="default" width="600" height="30">

 * A new container and image named mysql_auth will show up on the docker desktop
 * Now the workbench can be started with this connection
 * Make a connection with port number 3307 and users and users_name are in the tables

 <img src="utils/images/5-3.png" alt="default" width="500" height="150"><br/>
 <img src="utils/images/5-4.png" alt="default" width="500" height="300"><br/>
 <img src="utils/images/5-5.png" alt="default" width="500" height="300">

 ## 6. In MySQL Workbench, click on the '+' icon next to 'MySQL Connections' to create a new connection.
  * Verify that the port number is set to '3307'. You can find this in the 'Port' field. If it's not 3307, change it to 3307.
  * In the 'Username', 'password' field, enter the username and password provided in your Docker Compose configuration.
  * Once you've entered the necessary information, click on the 'Test Connection'
  
 ## 7.  All previous steps that were completely done would be assumed, and the tables will be shown like data schema. 

 ### *** If you want to check the tables, following the command prompt pic:

  #### 1. Open the command prompt and navigate the folder which is cloned with konada-java-sever
  #### 2. Write the command 'docker ps' that indicates what you have things of containers
  #### 3. Now you can see the ID of mysql, and write the command 'docker exec -it "ID HERE" /bin/bash'
  #### 4. You might accessed bash command, and write the command 'mysql -u root -p'
  #### 5. Then, you can write the password for connection ID 'root'
  #### 6. After enter the password, 'show databases;' command will show what databases you have
  #### 7. Also, write the command 'use kon;' and 'show tables' respectively

  ![default](utils/images/7-1.png)
  ![default](utils/images/7-2.png)

  #### then you can see what you have like this!