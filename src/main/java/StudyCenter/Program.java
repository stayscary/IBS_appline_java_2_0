package StudyCenter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    private Date programStartDate;
    private Date programEndDate;
    private String programName;
    private List<Course> courseList = new ArrayList<>();
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    public Program(String programStartDate, String programName) {
        format.setLenient(false);
        try {
            this.programStartDate = format.parse(programStartDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.programName = programName;
    }

    public Date getProgramStartDate() {
        return programStartDate;
    }

    public String getProgramName() {
        return programName;
    }

    public void addCoursesToProgram(Course[] newCourses) {
        courseList.addAll(Arrays.asList(newCourses));
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public Date getProgramEndDate() {
        return programEndDate;
    }

    public int countProgramDuration() {
        int programDurationInHours = 0;
        for (Course course : courseList) {
            programDurationInHours += course.getCourseDuration();
        }
        return programDurationInHours;
    }

    public void calculateProgramEndDate() {
        Calendar calendar = Calendar.getInstance();
        int programDurationInHours = countProgramDuration();
        calendar.setTime(this.programStartDate);
        calendar.add(Calendar.DAY_OF_MONTH, programDurationInHours / 8);
        calendar.add(Calendar.HOUR_OF_DAY, programDurationInHours % 8);
        Date endDate = calendar.getTime();
        programEndDate = endDate;
    }

    public String showProgramProgress(Date startTime, Date endTime) {
        Calendar calendar = Calendar.getInstance();
        Date currentDate = calendar.getTime();
        if (currentDate.before(startTime)) {
            return ("Program has not been started yet\n");
        } else if (currentDate.after(endTime)) {
            return ("Program has been finished already\n");
        } else {
            return ("Program is in progress\n");
        }
    }

    public StringBuilder showProgramCourses() {
        StringBuilder coursesLine = new StringBuilder();
        for (Course course : courseList) {
            coursesLine.append("COURSE: ").append(course.getCourseName()).append(" DURATION: ").append(course.getCourseDuration()).append(" hours\n");
        }
        return coursesLine;
    }
}
