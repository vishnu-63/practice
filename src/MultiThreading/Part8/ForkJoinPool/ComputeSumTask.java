package MultiThreading.Part8.ForkJoinPool;

import java.lang.ref.WeakReference;
import java.util.concurrent.RecursiveTask;

public class ComputeSumTask extends RecursiveTask<Integer> {
    int start;
    int end;
    ComputeSumTask(int start,int end) {
        this.start=start;
        this.end=end;
    }
    @Override
    protected Integer compute() {
        if(end-start<=4){
            int sum=0;
            for(int i=start;i<=end;i++) {
                sum+=i;
            }
            return sum;
        }
        else{
            int mid=(start+end)/2;
            ComputeSumTask leftTask=new ComputeSumTask(start,mid);
            ComputeSumTask rightTask=new ComputeSumTask(mid+1,end);

            //Fork The SubTasks For Parallel Executiom
            leftTask.fork();
            rightTask.fork();

            //Combine The Results Of both The tasks
            int leftSum=leftTask.join();
            int rightSum=rightTask.join();

            //return the combined Computed Values
            return leftSum+rightSum;
        }


    }
}
