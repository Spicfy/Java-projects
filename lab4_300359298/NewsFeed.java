/* *
 * Use static array for NewsFeed
 * with constant MAX_SIZE
 * */

public class NewsFeed {

    private Post[] messages;
    private int size;
    public static final int MAX_SIZE = 25;

    public NewsFeed() {
    	messages = new Post[MAX_SIZE];
		size = 0;
    }

    public void add(Post message) {
		if(size >= MAX_SIZE){
			System.out.println("Max size for post has been reached");
		} 
		else{
			messages[size] = message;
	  		size ++;
		}
    }

    public Post get(int index) {
	     return messages[index];
    }

    public int size() {
	     return size;
    }

	  public void sort(){
			int i, j, argMin;
			Post tmp;
			for (i = 0; i < size - 1; i++) {
				argMin = i;
				for (j = i + 1; j < size(); j++) {
					if (messages[j].compareTo(messages[argMin]) < 0) {
						argMin = j;
					}
				}

  			tmp = messages[argMin];
  			messages[argMin] = messages[i];
  			messages[i] = tmp;
		  }

	  }

  	public NewsFeed getPhotoPost(){
  		NewsFeed photoFeed = new NewsFeed();
		for(int i =0; i <size(); i++){
			if(messages[i].getClass().getName().equals("PhotoPost")){
				photoFeed.add(messages[i]);
			}
		}
		return photoFeed;
  	}

  	public NewsFeed plus(NewsFeed other){
		NewsFeed combined = new NewsFeed();
		for(int i = 0; i < size(); i++){
			combined.add(messages[i]);
		}
		for(int j = 0; j<other.size(); j++){
			combined.add(other.messages[j]);
		}
		combined.sort();
		return combined;
  	}

}
