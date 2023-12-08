class GarbageCollection
{
    public static void main(String[] args)
    {
        Runtime runtime = Runtime.getRuntime();
        Integer garbage[] = new Integer[1000];
        System.out.println("Total Memory : "+runtime.totalMemory());
        System.out.println("Total Used Memory Before Garbage Collection : "+(runtime.totalMemory()-runtime.freeMemory()));
        runtime.gc();
        System.out.println("Total Used Memory After Garbage Collection : "+(runtime.totalMemory()-runtime.freeMemory()));
    }
}