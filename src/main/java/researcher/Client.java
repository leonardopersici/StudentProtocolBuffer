package researcher;


import it.ewlab.researcher.StudentOuterClass;

import java.io.IOException;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {

        Socket s = new Socket("localhost", 9999);

        StudentOuterClass.Student st =
                StudentOuterClass.Student.newBuilder()
                        .setName("Gabriele")
                        .setSurname("Civitarese")
                        .setYob(1998)
                        .setPlaceOfResidence(StudentOuterClass.Student.PlaceOfResidence.newBuilder().setAddress("Via Giovanni Celoria 18")
                                .setCity("Milano")
                                .setNation("Italia"))
                        .addPassedExams(StudentOuterClass.Student.PassedExams.newBuilder().setExamName("SDP")
                                .setMark(25)
                                .setDate("02/06/2021"))
                        .addPassedExams(StudentOuterClass.Student.PassedExams.newBuilder().setExamName("MOBILE COMPUTING")
                                .setMark(29)
                                .setDate("10/06/2018"))
                        .build();

        st.writeTo(s.getOutputStream());

        s.close();


    }
}
