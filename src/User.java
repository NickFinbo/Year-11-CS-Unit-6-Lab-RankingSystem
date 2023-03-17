public class User {
    int rank;
    int progress;

    public User() {
        this.rank = -8;
        this.progress = 0;
    }

    public int getRank() {
        return rank;
    }

    public int getProgress() {
        return progress;
    }

    public void incProgress(int activityrank){
        if(activityrank < -8 || activityrank > 8 || activityrank == 0) {
            throw new IllegalArgumentException("The rank of an activity cannot be less than 8, 0, or greater than 8!");
        }
        int diff = activityrank-rank;

        if(diff == 0){
            progress += 3;
        }
        if(diff == -1){
            progress += 1;
        }
        if(diff > 0){
            progress += 10*diff*diff;
        }

        if(progress < 100){
            return;
        }
        else{
            if(rank<-1){
                rank+=1;
                progress -= 100;
            }
            if(rank == -1){
                rank = 1;
                progress -= 100;
            }
            if(rank>0.1){
                rank += 1;
                progress -= 100;
            }
            if(rank == 8){
                return;
            }
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "rank=" + rank +
                ", progress=" + progress +
                '}';
    }
}
