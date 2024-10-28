import java.util.List;

public class MeetingRoom {
    private List<AttendTraining> attendees;

    public MeetingRoom(List<AttendTraining> attendees) {
        this.attendees = attendees;
    }

    public void conductTraining() {
        for (AttendTraining attendee : attendees) {
            attendee.attendTraining();
        }
    }
}