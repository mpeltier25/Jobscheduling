
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SchedSim {


public static void startSimulation() throws FileNotFoundException
{
Job job;
String var ="J";
File file=new File("input.txt");
if(!file.exists())
{
	System.out.println("File not found");
	System.exit(0);
}
Scanner inputFile= new Scanner(file);
while (inputFile.hasNext())
{
if(inputFile.hasNext()=="J")
{
//ReadyQueue();
ReadyQueue queue = null;
queue.add(null);
}
if(inputFile.hasNext()=="W")
{
//WaitingQueue();
WaitingQueue queue=null;
queue.add(null);
}
if(inputFile.hasNext()=="R")
{
int JobNo=0;
ReadyQueue queue=null;
queue.remove(JobNo);
}
if(inputFile.hasNext()=="C")
{
ReadyQueue queue=null;
queue.remove(0);
}
if(inputFile.hasNext()=="T")
{
ReadyQueue queue=null;
queue.remove(0);
}
}
}
public void processInternalEvents()
{
execute();	
}
public void processExternalEvents()
{
Job job = null;
job.getEntryTime();
job.getIdleTime();
job.getRunningTime();
job.getTimeRemaining();
}
public void execute() 
{
startSimulation();
processExternalEvents();
print();
processInternalEvents();
}
public void print()
{
Job job=null;
job.getEntryTime();
job.getExitType();
job.getJobNo();
job.getPriority();
}
public static void main(String args[])
{
startSimulation();
}
}
