import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadyQueue {
   private List<LinkedList<Job>> priorityQueue = new ArrayList<LinkedList<Job>>();

   public ReadyQueue() {
      for (int i = 0; i < 4; i++) {
         priorityQueue.add(new LinkedList<Job>());
      }
   }

   public void add(Job job) {
	   job.execute();
   }
   public int peek() {
	return priorityQueue.size();
   	}

   //public Job remove() {
   //}

   //public void remove(Job job) {
   //}

   public Job remove(int JobNo) {
   Job job = null;
   return job;
   }
         
   public boolean isEmpty() {
      if (peek() == 0)
         return true;
      else
         return false;
   }
   public void updateIdleTimes() {
      for (LinkedList<Job> l : priorityQueue) {
         for (Job job : l) {
            job.incrementIdleTime();
         }
      }
   }

}
