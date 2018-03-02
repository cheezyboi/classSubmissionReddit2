public class redditTester {
	public static void main(String[] args) {
		String fileName = "redditPosts.txt";
		redditUser redditRead = new redditUser();
		redditRead.readRedditFile(fileName);
				
		redditRead.detectTrump("");
		System.out.println(redditRead.counter);
		
		/*
		 * // name of the file String fileName = "redditPosts.txt";
		 * 
		 * // this will reference one line at a time String line = null;
		 * 
		 * try { // FileReader reads text files in the default encoding FileReader
		 * myFileReader = new FileReader(fileName);
		 * System.out.println("I was able to open your file!");
		 * 
		 * // Always wrap FileReader in BufferedReader BufferedReader bufferedReader =
		 * new BufferedReader(myFileReader);
		 * 
		 * while ((line = bufferedReader.readLine()) != null) {
		 * System.out.println(line); }
		 * 
		 * // Always close files bufferedReader.close();
		 * 
		 * /* ; String line = null; line = myBufferReader.readLine();
		 * System.out.println(line); line = myBufferReader.readLine();
		 * System.out.println(line); line = myBufferReader.readLine();
		 * System.out.println(line); line = myBufferReader.readLine();
		 * System.out.println(line);
				}
		 * catch (Exception ex) {
		 * System.out.println("I don't think I was able to find your file"); }
		 * 
		 * catch (FileNotFoundException ex) { System.out.println("Unable to open file '"
		 * + fileName + "'"); } catch (IOException ex) {
		 * System.out.println("Error reading file '" + fileName + "'"); } }
		 */
	}
}
