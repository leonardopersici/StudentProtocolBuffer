# Setup ProtocolBuffer and GRPC
This repository contains a simple example that enables you to test the environment for **ProtocolBuffer** and **GRPC**.

* You can import the project directly from a **V**ersion **C**ontrol **S**ystem, by providing the following URL: 
https://ewserver.di.unimi.it/gitlab/riccardopresotto/setup_grpc.git

<img src = './assets/img_1.png'>

* Otherwise, take care to import the project as a Gradle Project

* Compile the .proto files: 
	1.  Open the terminal of the IntelliJ IDE
	2. Run the following command:
		* **Windows**: *gradlew build*
		* **MacOS/Linux**: *./gradlew build*
	3. Check if some files have been generated in the directory *setup_grpc/build/generated/source/proto/main/java*

* The testing files are located in the directory: *setup_grpc/src/main/java/researcher*


