package srini.algorithms.designpatterns;

public class BuilderTest {
	private int issue;
	private int testcase;
	private String data;
	
	public int getIssue() {
		return issue;
	}
	public void setIssue(int issue) {
		this.issue = issue;
	}
	public int getTestcase() {
		return testcase;
	}
	public void setTestcase(int testcase) {
		this.testcase = testcase;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public static class Builder{
		private int issue;
		private int testcase;
		private String data;
		public Builder issue(int issue){
			this.issue = issue;
			return this;
		}
		public Builder testcase(int test){
			this.testcase = test;
			return this;	
		}
		public Builder data(String data){
			this.data = data;
			return this;
		}	
		public BuilderTest build(){
			return new BuilderTest(this);
		}
	}
	public BuilderTest(Builder copy){
		this.issue = copy.issue;
		this.testcase = copy.testcase;
		this.data = copy.data;
	}
}
