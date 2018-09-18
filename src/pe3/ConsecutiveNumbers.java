package pe3;

public class ConsecutiveNumbers {
    private String series;

    ConsecutiveNumbers(){}

    public void setSeries(String series){
        this.series = series;
    }

    public String checkIfConsecutive(){
        String[] tokens = this.series.trim().split(",");
        for(int i=0; i<tokens.length; i++){
            tokens[i] = tokens[i].trim();
        }
        int[] diff = new int[tokens.length - 1];
        for(int i=1; i<tokens.length; i++){
            diff[i-1] = Integer.parseInt(tokens[i]) - Integer.parseInt(tokens[i-1]);
            //System.out.println(diff[i-1]);
            if(!(diff[i-1] == 1 || diff[i-1] == -1))
                return "Non-consecutive Numbers";
        }
        for(int i=1; i<diff.length; i++){
            if(diff[i] != diff[i-1])
                return "Non-consecutive Numbers";
        }
        return "Consecutive Numbers";
    }
}
