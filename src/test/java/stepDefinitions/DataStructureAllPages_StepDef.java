package stepDefinitions;

import java.io.IOException;

import driver.Driverfactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ArrayPage;
import pages.CommonCode;
import pages.DataStructurePage;
import pages.GraphPage;
import pages.HomePage;
import pages.LinkedListPage;
import pages.LoginPage;
import pages.QueuePage;
import pages.StackPage;
import pages.TreePage;
import utilities.ExcelReader;

public class DataStructureAllPages_StepDef {
	
	    private HomePage homePage;
	    private LoginPage loginPage;
	    private ArrayPage arrayPage;
	    private DataStructurePage dataStructurePage;
	    private GraphPage graphPage;
	    private LinkedListPage linkedListPage;
	    private QueuePage queuePage;
	    private StackPage stackPage;
	    private TreePage treePage;
	    private CommonCode commonCode;

	    ExcelReader excelReader = new ExcelReader();
	    String username, password, validCode,invalidCode,searchArrayCode,maxConOneCode,findNumEvenDigCode,
	    squareSortArrayCode;
	    
	public DataStructureAllPages_StepDef() throws IOException {
		
        homePage = new HomePage(Driverfactory.getDriver());
        loginPage = new LoginPage(Driverfactory.getDriver());
        arrayPage = new ArrayPage(Driverfactory.getDriver());
        dataStructurePage = new DataStructurePage(Driverfactory.getDriver());
        graphPage = new GraphPage(Driverfactory.getDriver());
        linkedListPage = new LinkedListPage(Driverfactory.getDriver());
        queuePage = new QueuePage(Driverfactory.getDriver());
        stackPage = new StackPage(Driverfactory.getDriver());
        treePage = new TreePage(Driverfactory.getDriver());
        commonCode = new CommonCode(Driverfactory.getDriver());

        username = ExcelReader.getDataFromExcel("LoginData", 1, 0);
        password = ExcelReader.getDataFromExcel("LoginData", 1, 1);
        validCode = ExcelReader.getDataFromExcel("EditorCodes", 1, 0);
        invalidCode= ExcelReader.getDataFromExcel("EditorCodes", 1, 1);
        searchArrayCode=ExcelReader.getDataFromExcel("EditorCodes", 1, 3);
        maxConOneCode=ExcelReader.getDataFromExcel("EditorCodes", 1, 4);
        findNumEvenDigCode=ExcelReader.getDataFromExcel("EditorCodes", 1, 5);
        squareSortArrayCode=ExcelReader.getDataFromExcel("EditorCodes", 1, 6);
               		
    }
	
//********************************* Array Page*****************************************************
	
	@Given("The user is logged in to the DS Algo portal")
	public void the_user_is_logged_in_to_the_ds_algo_portal() {
    	 loginPage.userLogin(username, password);
    	 arrayPage.clickarrayGetStartedbtn();
	}

	@When("The user clicks on the Arrays in Python link")
	public void the_user_clicks_on_the_arrays_in_python_link() {
		arrayPage.clickarrayInPythonLink();
		arrayPage.verifyArrayInPythonPage();
	}

	@When("The user clicks Try Here button")
	public void the_user_clicks_try_here_button() {
		commonCode.clickTryHereBtn();
	}


	@When("The user enter valid python {string} in tryEditor from sheet")
	public void the_user_enter_valid_python_in_try_editor_from_sheet(String string) {
	   commonCode.enterEditorCode(validCode);
	}

	@When("The user clicks on run button")
	public void the_user_clicks_on_run_button() {
		commonCode.clickRunBtn();
	}

	@When("The user enter python {string} with invalid syntax in tryEditor from sheet")
	public void the_user_enter_python_with_invalid_syntax_in_try_editor_from_sheet(String string) {
		commonCode.enterEditorCode(invalidCode);
	}

	@When("The user clicks on run button of editor in Arrays in Python page")
	public void the_user_clicks_on_run_button_of_editor_in_arrays_in_python_page() {
		commonCode.clickRunBtn();
	}

	@Then("The user should be presented with error message")
	public void the_user_should_be_presented_with_error_message() {
		commonCode.verifyEditorErrAlert();
		
	}

	@When("The user clicks Arrays Using List link")
	public void the_user_clicks_arrays_using_list_link() {
		arrayPage.clickarrayUsingListLink();
		arrayPage.verifyarrayUsingList();
	}


	@Then("The user should be presented with Run result")
	public void the_user_should_be_presented_with_run_result() {
		commonCode.verifyEditorResult(); 
	}

	@When("The user clicks Basic Operations in Lists link")
	public void the_user_clicks_basic_operations_in_lists_link() {
		arrayPage.clickbasicOperationsinListLink();
		arrayPage.verifybasicOperationsinListPage();
	}

	@When("The user clicks Applications of Array link")
	public void the_user_clicks_applications_of_array_link() {
		arrayPage.clickapplicationsOfArrayLink();
		arrayPage.verifyapplicationsOfArrayPage();
	}

	@When("The user clicks Practice Questions link")
	public void the_user_clicks_practice_questions_link() {
		commonCode.clickPracticeQueLink();
		
	}

	@When("The user clicks the Search the array link")
	public void the_user_clicks_the_search_the_array_link() {
		arrayPage.clicksearchTheArrayLink();
		arrayPage.veriyfPracticeQuesPage1();
	}
	
	@When("The user enter valid python {string} in tryEditor from sheet for search the array question")
	public void the_user_enter_valid_python_in_try_editor_from_sheet_for_search_the_array_question(String string) {
		arrayPage.enterPracticeEditorCode(searchArrayCode);
	}

	@When("The user clicks on Submit button")
	public void the_user_clicks_on_submit_button() {
		arrayPage.clickSubmitBtn();
	}

	@Then("The user should be presented with successful submission message")
	public void the_user_should_be_presented_with_successful_submission_message() {
		commonCode.verifyEditorResult();
	}

	@When("The user enter invalid python {string} in tryEditor from sheet for search the array question")
	public void the_user_enter_invalid_python_in_try_editor_from_sheet_for_search_the_array_question(String string) {
		arrayPage.enterPracticeEditorCode(invalidCode);
	}

	@When("The user clicks the Max Consecutive Ones link")
	public void the_user_clicks_the_max_consecutive_ones_link() {
		arrayPage.clickmaxConsecutiveOnesLink();
		arrayPage.veriyfPracticeQuesPage2();
	}

	@When("The user enter valid python {string} in tryEditor from sheet for max consecutive ones question")
	public void the_user_enter_valid_python_in_try_editor_from_sheet_for_max_consecutive_ones_question(String string) {
		arrayPage.enterPracticeEditorCode(maxConOneCode);
	}

	@When("The user enter python {string} with invalid syntax in tryEditor from sheet for max consecutive ones question")
	public void the_user_enter_python_with_invalid_syntax_in_try_editor_from_sheet_for_max_consecutive_ones_question(String string) {
		arrayPage.enterPracticeEditorCode(invalidCode);
	}

	@When("The user clicks the Find Numbers with Even Number of Digits link")
	public void the_user_clicks_the_find_numbers_with_even_number_of_digits_link() {
		arrayPage.clickfindEvenNumberDigitsLink();
		arrayPage.veriyfPracticeQuesPage3();
	}

	@When("The user enter valid python {string} in tryEditor from sheet for even number question")
	public void the_user_enter_valid_python_in_try_editor_from_sheet_for_even_number_question(String string) {
		arrayPage.enterPracticeEditorCode(findNumEvenDigCode);
	}

	@When("The user enter python {string} with invalid syntax in tryEditor from sheet for even number question")
	public void the_user_enter_python_with_invalid_syntax_in_try_editor_from_sheet_for_even_number_question(String string) {
		arrayPage.enterPracticeEditorCode(invalidCode);
	}

	@When("The user clicks the Squares of a Sorted Array link")
	public void the_user_clicks_the_squares_of_a_sorted_array_link() {
		arrayPage.clicksquaresSortedArrayLink();
	}

	@When("The user enter python {string} with invalid syntax in tryEditor from sheet for the Square sorted array question")
	public void the_user_enter_python_with_invalid_syntax_in_try_editor_from_sheet_for_the_square_sorted_array_question(String string) {
		arrayPage.enterPracticeEditorCode(invalidCode);
	}
	
	@When("The user enter python {string} with valid syntax in tryEditor from sheet for the Square sorted array question")
	public void the_user_enter_python_with_valid_syntax_in_try_editor_from_sheet_for_the_square_sorted_array_question(String string) {
		arrayPage.enterPracticeEditorCode(squareSortArrayCode);
	}
	
	@Then("The user should be redirected to question four page containing tryEditor with Run and Submit buttons")
	public void the_user_should_be_redirected_to_question_four_page_containing_try_editor_with_run_and_submit_buttons() {
		arrayPage.veriyfPracticeQuesPage4();
	}

	@Given("The user navigates back to the Array Introduction page")
	public void the_user_navigates_back_to_the_array_introduction_page() {
	     commonCode.navigateBack();
	}

	@Given("The user is on Question page with run and submit button")
	public void the_user_is_on_question_page_with_run_and_submit_button() {
	    arrayPage.verifyPracticeEditorPage();
	}

	@When("The user enter valid python {string} in tryEditor from sheet for search the arrays ones question")
	public void the_user_enter_valid_python_in_try_editor_from_sheet_for_search_the_arrays_ones_question(String string) {
		arrayPage.enterPracticeEditorCode(searchArrayCode);
	}


	@When("The user enter python {string} with invalid syntax in tryEditor from sheet for search the array question")
	public void the_user_enter_python_with_invalid_syntax_in_try_editor_from_sheet_for_search_the_array_question(String string) {
		arrayPage.enterPracticeEditorCode(invalidCode);
	}

	@Given("The user navigates back to the Array Practice page")
	public void the_user_navigates_back_to_the_array_practice_page() {
	    commonCode.navigateBack();
	}
	
//***********************************Data Structure Page*****************************************************
	
	@Given("The user is on the Data Structures Introduction after logged in")
	public void the_user_is_on_the_data_structures_introduction_after_logged_in() {
	    loginPage.userLogin(username, password);
	    dataStructurePage.clickdataStructuresGetStartedbtn();
	}

	@When("The user clicks Time Complexity link")
	public void the_user_clicks_time_complexity_link() {
		dataStructurePage.clicktimeComplexitylink();
		dataStructurePage.verifytimeComplexitylink();
	}

	@Given("The page having an tryEditor with a Run button to test is opened")
	public void the_page_having_an_try_editor_with_a_run_button_to_test_is_opened() {
		commonCode.verifyTryHereEditorPage(); 
	}

	@Given("The user naviagtes back to Time Complexity Page")
	public void the_user_naviagtes_back_to_time_complexity_page() {
		commonCode.navigateBack();
	}

	@Then("The user should be redirected to Practice page of Data Structure")
	public void the_user_should_be_redirected_to_practice_page_of_data_structure() {
	    commonCode.verifyPracticePageDataStructure();
	}
	
	
//******************************************Graph Page***********************************************
	
	@Given("The user is on the Graph Introduction after logged in")
	public void the_user_is_on_the_graph_introduction_after_logged_in() {
		loginPage.userLogin(username, password);
		graphPage.clickgetstartbtn();
	}
	

	@When("The user clicks Graph link")
	public void the_user_clicks_graph_link() {
		graphPage.clickGraphLink();
		graphPage.verifyGraphlinkPage();
	}
	
	@Given("The user navigates back to Graph Introduction page")
	public void the_user_navigates_back_to_graph_introduction_page() {
		commonCode.navigateBack();
	}

	@When("The user clicks Graph Representations link")
	public void the_user_clicks_graph_representations_link() {
		graphPage.clickgraphrepresentation();
		graphPage.verifyGraphRepresentationPage();
	}
	
	@Given("The user naviagtes back to Graph Representations page")
	public void the_user_naviagtes_back_to_graph_representations_page() {
	     commonCode.navigateBack();
	}
	
	@Then("The user should be redirected to Practice page of Graph")
	public void the_user_should_be_redirected_to_practice_page_of_Graph() {
		commonCode.verifyPracticePageGraph();
	}
	
//***************************************Linked List Page******************************************
	
	@Given("The user is on the Linked List page after logged in")
	public void the_user_is_on_the_linked_list_page_after_logged_in() {
		loginPage.userLogin(username, password);
		linkedListPage.clicklinkedListGetStartedbtn();
	}

	@When("The user clicks Introduction link")
	public void the_user_clicks_introduction_link() {
		linkedListPage.clickintroductionLink();
		linkedListPage.verifyintroductionLink();
	}


	@When("The user clicks Creating Linked List link")
	public void the_user_clicks_creating_linked_list_link() {
		linkedListPage.clickcreatingLinkedListLink();
		linkedListPage.verifycreatingLinkedListLink();
	}

	     
	@When("The user clicks Types of Linked List link")
	public void the_user_clicks_types_of_linked_list_link() {
		linkedListPage.clicktypesOfLinkedListLink();
		linkedListPage.verifytypesOfLinkedListLink();
	}

	@When("The user clicks Implement Linked List in Python link")
	public void the_user_clicks_implement_linked_list_in_python_link() {
		linkedListPage.clickimplementLinkedListInPythonLink();
		linkedListPage.verifyimplementLinkedListInPythonLink();
	}

	@When("The user clicks Traversal link")
	public void the_user_clicks_traversal_link() {
		linkedListPage.clicktraversalLink();
		linkedListPage.verifytraversalLink();
	}

	@When("The user clicks Insertion link")
	public void the_user_clicks_insertion_link() {
		linkedListPage.clickInsertionLink();
		linkedListPage.verifyInsertionLink();
	}

	@When("The user clicks Deletion link")
	public void the_user_clicks_deletion_link() {
		linkedListPage.clickdeletionLink();
		linkedListPage.verifydeletionLink();
	}
	

	@Given("The user navigates back to Linked list Introduction page")
	public void the_user_navigates_back_to_linked_list_introduction_page() {
	    commonCode.navigateBack();
	}
	
	@Then("The user should be redirected to Practice page of LinkedList")
	public void the_user_should_be_redirected_to_practice_page_of_LinkedList() {
		commonCode.verifyPracticePageLinkedList();
	}
	
//*******************************************Queue Page*************************************************
	
	@Given("The user is on the Queue Introduction after logged in")
	public void the_user_is_on_the_queue_introduction_after_logged_in() {
		loginPage.userLogin(username, password);
		queuePage.clkqueuegetstartbutton();
	}

	@When("The user clicks Implementation of Queue in Python link")
	public void the_user_clicks_implementation_of_queue_in_python_link() {
		queuePage.clkimplementqueueinpython();
		queuePage.verifypageofimplementofqueueinpython();
		
	}

	@When("The user clicks Implementation using collections.deque link")
	public void the_user_clicks_implementation_using_collections_deque_link() {
		queuePage.clkimplementusingcollqueue();
		queuePage.verifypageimplemcollect();
	}

	@When("The user clicks Implementation using arraylink")
	public void the_user_clicks_implementation_using_arraylink() {
		queuePage.clkimplemqueueusearray();
		queuePage.verifypageimplemusingarray();
	}

	@When("The user clicks Queue Operations link")
	public void the_user_clicks_Queue_Operations_link() {
		queuePage.clkqueueoperations();
		queuePage.verifypagequeueoper();
	}

	@Given("The user naviagtes back to Queue Introduction page")
	public void the_user_naviagtes_back_to_queue_introduction_page() {
	    commonCode.navigateBack();
	}
	
	
	@Then("The user should be redirected to Practice page of Queue")
	public void the_user_should_be_redirected_to_practice_page_of_Queue() {
		commonCode.verifyPracticePageQueue();
	}

//****************************************Stack Page************************************************
	
	@Given("The user is on the Stack Introduction after logged in")
	public void the_user_is_on_the_stack_introduction_after_logged_in() {
		loginPage.userLogin(username, password);
		stackPage.clkstackgetstartbutton();
	}

	@When("The user clicks Operations in Stack link")
	public void the_user_clicks_operations_in_stack_link() {
		stackPage.clkoperationsinstacklink();
		stackPage.verifypageoperationsinstack();
	}

	@When("The user clicks Implementation link")
	public void the_user_clicks_implementation_link() {
		stackPage.clkimplementationlink();
		stackPage.verifypageofimplementation();
	}

	@When("The user clicks Applications link")
	public void the_user_clicks_applications_link() {
		stackPage.clkapplicationlink();
		stackPage.verifypageofapplications();
	}

	
	@Given("The user navigates back to Stack Introduction page")
	public void the_user_navigates_back_to_stack_introduction_page() {
	    commonCode.navigateBack();
	}
	
	@Then("The user should be redirected to Practice page of Stack")
	public void the_user_should_be_redirected_to_practice_page_of_Stack() {
		commonCode.verifyPracticePageStack();
	}
	
//****************************************Tree Page***********************************************
	
	@Given("The user is on the Tree Introduction after logged in")
	public void the_user_is_on_the_tree_introduction_after_logged_in() {
		loginPage.userLogin(username, password);
		treePage.clickGetStartedTree();
	}

	@When("The user clicks Overview of Trees link")
	public void the_user_clicks_overview_of_trees_link() {
		treePage.clickOverviewofTrees();
		treePage.verifyOverviewofTrees();
	}

	
	@When("The user clicks Terminologies link")
	public void the_user_clicks_terminologies_link() {
		treePage.clickTerminologies();
		treePage.verifyTerminologies();
	}

	@When("The user clicks Types of Trees link")
	public void the_user_clicks_types_of_trees_link() {
		treePage.clickTypesOfTrees();
		treePage.verifytypesoftrees();
	}


	@When("The user clicks Tree Traversals link")
	public void the_user_clicks_tree_traversals_link() {
		treePage.clickTreeTraversals();
		treePage.verifytreetraversals();
	}

	@When("The user clicks Traversals-Illustration link")
	public void the_user_clicks_traversals_illustration_link() {
		treePage.clickTraversalIllustration();
		treePage.verifytaversalillustration();
	}

	@When("The user clicks Binary Trees link")
	public void the_user_clicks_binary_trees_link() {
		treePage.clickBinaryTrees();
		treePage.verifybinarytrees();
	}

	@When("The user clicks Types of Binary Trees link")
	public void the_user_clicks_types_of_binary_trees_link() {
		treePage.clickTypesofBinaryTrees();
		treePage.verifytypesofbinarytree();
	}

	@When("The user clicks Implementation in Python link")
	public void the_user_clicks_implementation_in_python_link() {
		treePage.clickImplementationinPython();
		treePage.verifyimplementationinpython();
	}

	@When("The user clicks Binary Tree Traversals link")
	public void the_user_clicks_binary_tree_traversals_link() {
		treePage.clickBinaryTreTraversals();
		treePage.verifybinarytreetraversals();
	}


	@When("The user clicks Implementation of Binary Trees link")
	public void the_user_clicks_implementation_of_binary_trees_link() {
		treePage.clickImplementationofBinaryTrees();
		treePage.verifyimplementationofbinarytree();
	}


	@When("The user clicks Applications of Binary trees link")
	public void the_user_clicks_applications_of_binary_trees_link() {
		treePage.clickApplicationsofBinarytrees();
		treePage.verifyapplicationsofbinarytree();
	}


	@When("The user clicks Binary Search Trees link")
	public void the_user_clicks_binary_search_trees_link() {
		treePage.ClickBinarySearchtrees();
		treePage.vreifyBinarysearchtree();
	}


	@When("The user clicks Implementation Of BST link")
	public void the_user_clicks_implementation_of_bst_link() {
		treePage.clickImplementationOfBST();
		treePage.verifyimplementationofBST();
	}

	@Given("The user naviagates back to Tree Introduction page")
	public void the_user_naviagates_back_to_tree_introduction_page() {
	    commonCode.navigateBack();
	}
	
	@Then("The user should be redirected to Practice page of Tree")
	public void the_user_should_be_redirected_to_practice_page_of_Tree() {
		commonCode.verifyPracticePageTree();
	}
	
	
//******************************************************************************************************************

}
