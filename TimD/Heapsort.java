public class Heapsort {

    private ALHeap _heap;

    public Heapsort() {
	_heap = new ALHeap();
    }

    public Integer[] sort( Integer[] data ) {
	for ( Integer a : data )
	    _heap.add(a);
	
	Integer[] ret = new Integer[data.length];
	ALHeap temp = _heap;
	
	for ( int i=0; i<ret.length; i++ )
	    ret[i] = temp.removeMin();

	return ret;
    }

    public static void main( String[] args ) {
	
	Heapsort _heap = new Heapsort();
	Integer[] nums = { 1, 3, 8, 5, 2, 4 };
	
	System.out.print( "Original Array: " );
	for ( Integer i : nums )
	    System.out.print( i + " " );
	System.out.print("\n");

	Integer[] numsSorted =  _heap.sort(nums);

	System.out.print( "Sorted Array: " );
	for ( Integer i : numsSorted )
	    System.out.print( i + " " );
	System.out.print("\n");
    }
    
}
	    
