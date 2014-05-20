import java.io.*;
import java.util.*;

public class Heapsort{

    ALHeap heap = new ALHeap();

    public Integer[] sort(Integer[] data){
	Integer[] ret = new Integer[];

	for(Integer a: data){
	    heap.add(a);
	}

	for(int i = 0; i < heap.size(); i ++){
	    ret.add(heap.removeMin());
	}
	return ret;
    }
}

	