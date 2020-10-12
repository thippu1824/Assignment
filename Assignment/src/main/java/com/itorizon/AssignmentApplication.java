package com.itorizon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.itorizon.arrays.ArraysPrograms;
import com.itorizon.collection.ArrayListPrograms;
import com.itorizon.collection.HashMapPrograms;
import com.itorizon.collection.HashSetPrograms;
import com.itorizon.collection.LinkedListPrograms;
import com.itorizon.collection.TreeMapPrograms;
import com.itorizon.collection.TreeSetPrograms;
import com.itorizon.strings.StringPrograms;

/**
 * This class indicates the starting point of Spring boot application
 * @author Thippeswamy H
 *@version 1.0.0
 */
@SpringBootApplication
public class AssignmentApplication implements CommandLineRunner{

	@Autowired
	private StringPrograms stringPrograms;//Injecting StringPrograms
	
	@Autowired
	private ArraysPrograms arraysPrograms;//Injecting ArraysPrograms
	
	@Autowired
	private ArrayListPrograms arrayListPrograms;//Injecting ArrayListPrograms
	
	@Autowired
	private LinkedListPrograms linkedListPrograms;//Injecting LinkedListPrograms
	
	@Autowired
	private HashSetPrograms hashSetPrograms;//Injecting HashSetPrograms
	
	@Autowired
	private TreeSetPrograms treeSetPrograms;//Injecting TreeSetPrograms
	
	@Autowired
	private HashMapPrograms hashMapPrograms;//Injecting HashMapPrograms
	
	@Autowired
	private TreeMapPrograms treeMapPrograms;//Injecting TreeMapPrograms

	/**
	 * This is the entry point when this class is executed
	 * @param args String array arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(AssignmentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//Executing String class programs
		stringPrograms.countNoOfCharacters();
		stringPrograms.countVowelsAndConsonants();
		stringPrograms.removeWhiteSpace();
		stringPrograms.caseCoversion();
		stringPrograms.frequencyOfCharacter();
		stringPrograms.replaceSpaceWithCharacter();
		stringPrograms.divideEqualParts();
		stringPrograms.minAndMaxOccuringChar();
		stringPrograms.reverseOfString();
		stringPrograms.findDupplicate();
		stringPrograms.findLargeAndSmallWord();
		stringPrograms.seperateIndividualChar();
		stringPrograms.convertCharToString();
		stringPrograms.findDuplicateElements();
		stringPrograms.sortAlpabeticalOrder();
		
		//Executing Arrays class programs
		arraysPrograms.arrayListToArray();
		arraysPrograms.pairOfElementsEqualToNumber();
		arraysPrograms.equalityOfTwoArrays();
		arraysPrograms.findMissingNumber();
		arraysPrograms.findCommonElements();
		arraysPrograms.moveZeroToEnd();
		arraysPrograms.noOfEvenAndOdd();
		arraysPrograms.differenceBetweenLargeAndSmall();
		arraysPrograms.avgOfIntegers();
		arraysPrograms.arrayContainsSpecifiedElement();
		arraysPrograms.removeDuplicate();
		arraysPrograms.sumOfElementsOfArray();
		arraysPrograms.smallestAndSecondSmallestElement();
		arraysPrograms.zeroOnLeftOneOnRight();
		arraysPrograms.negativeBeforePositiveElements();
		arraysPrograms.positiveBeforeNegativeElements();
		arraysPrograms.seperateEvenAndOdd();
		arraysPrograms.sumCloseToZero();
		arraysPrograms.sortNumericAndStringArray();
		arraysPrograms.sumOfArray();
		arraysPrograms.printPattern();
		arraysPrograms.avaerageOfArray();
		arraysPrograms.containsSpecificElement();
		arraysPrograms.findIndex();
		arraysPrograms.copyArrayElements();
		arraysPrograms.insertElement();
		arraysPrograms.findMaxAndMin();
		arraysPrograms.reverseArray();
		arraysPrograms.duplicateValues();
		arraysPrograms.duplicateValuesStrings();
		arraysPrograms.removeElement();
		arraysPrograms.commonElementsOfIntArray();
		arraysPrograms.secondLargest();
		arraysPrograms.secondSmallest();
		arraysPrograms.addMatrices();
		
		
		//Executing ArrayList class programs
		arrayListPrograms.addToArrayList();
		arrayListPrograms.insertAtFirstPosition();
		arrayListPrograms.enterIndexToShowName();
		arrayListPrograms.updateArrayElement();
		arrayListPrograms.removeThirdElement();
		arrayListPrograms.copyElementsToOtherArrayList();
		arrayListPrograms.copyElementsToOtherArrayList();
		arrayListPrograms.reverseJoinClone();
		arrayListPrograms.checkArrayEmptyOrNot();
		arrayListPrograms.searchAndSortArray();
		
		//Executing LinkedList class programs
		linkedListPrograms.addToEndOfList();
		linkedListPrograms.iterateList();
		linkedListPrograms.inserAtSpecifiedPlace();
		linkedListPrograms.insertAtFrontAndEnd();
		linkedListPrograms.displayAndRemove();
		linkedListPrograms.joinTwoLinkedList();
		linkedListPrograms.cloneList();
		linkedListPrograms.removeAndRetreive();
		linkedListPrograms.ConvertToArrayList();
		
		//Executing HashSet class programs
		hashSetPrograms.addName();
		hashSetPrograms.iterateHashSet();
		hashSetPrograms.countAndEmptyHashSet();
		hashSetPrograms.convertToArrayList();
		hashSetPrograms.compare();
		hashSetPrograms.compareAndRetain();
		hashSetPrograms.removeAllElements();
		
		//Executing TreeSet class programs
		treeSetPrograms.iterateTreeSet();
		treeSetPrograms.addElement();
		treeSetPrograms.reverseCountGetFirstAndLastElement();
		treeSetPrograms.numberLessThan7();
		treeSetPrograms.reverseCountGetFirstAndLastElement();
		treeSetPrograms.getSpecificElement();
		treeSetPrograms.retreiveAndRemove();
		treeSetPrograms.removeParticularElement();
		
		
		//Executing HashMap class programs
		hashMapPrograms.addStudent();
		hashMapPrograms.iterateHashMap();
		hashMapPrograms.getAndCountEntries();
		hashMapPrograms.copyAndRemove();
		hashMapPrograms.containsSpecificStudent();
		hashMapPrograms.setAndCollectionView();
		
		
		//Executing TreeMap class programs
		treeMapPrograms.getAndDeleteAll();
		treeMapPrograms.sortKeysInDescendingOrder();
		treeMapPrograms.getFirstAndLastKey();
		treeMapPrograms.reverseTreeSet();
		
	}

}
