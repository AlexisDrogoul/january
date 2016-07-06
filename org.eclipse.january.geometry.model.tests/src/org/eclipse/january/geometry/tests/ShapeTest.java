/**
 */
package org.eclipse.january.geometry.tests;

import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.january.geometry.GeometryFactory;
import org.eclipse.january.geometry.GeometryPackage;
import org.eclipse.january.geometry.Operator;
import org.eclipse.january.geometry.Shape;
import org.eclipse.january.geometry.Vertex;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Shape</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.january.geometry.INode#changeDecoratorProperty(java.lang.String, java.lang.Object) <em>Change Decorator Property</em>}</li>
 *   <li>{@link org.eclipse.january.geometry.INode#getPropertyNames() <em>Get Property Names</em>}</li>
 *   <li>{@link org.eclipse.january.geometry.INode#getProperty(java.lang.String) <em>Get Property</em>}</li>
 *   <li>{@link org.eclipse.january.geometry.INode#setProperty(java.lang.String, double) <em>Set Property</em>}</li>
 *   <li>{@link org.eclipse.january.geometry.INode#addNode(org.eclipse.january.geometry.INode) <em>Add Node</em>}</li>
 *   <li>{@link org.eclipse.january.geometry.INode#removeNode(org.eclipse.january.geometry.INode) <em>Remove Node</em>}</li>
 *   <li>{@link org.eclipse.january.geometry.INode#copy(java.lang.Object) <em>Copy</em>}</li>
 *   <li>{@link org.eclipse.january.geometry.INode#clone() <em>Clone</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ShapeTest extends TestCase {

	/**
	 * The fixture for this Shape test case.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected Shape fixture = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ShapeTest.class);
	}

	/**
	 * Constructs a new Shape test case with the given name.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Shape test case.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Shape fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Shape test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Shape getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GeometryFactory.eINSTANCE.createShape());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link org.eclipse.january.geometry.Shape#getPropertyNames()
	 * <em>Get Property Names</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.january.geometry.Shape#getPropertyNames()
	 * @generated NOT
	 */
	public void testGetPropertyNames() {

		// The shape for testing
		Shape shape = GeometryFactory.eINSTANCE.createShape();

		// The shape should initially have no properties
		EList<String> properties = shape.getPropertyNames();
		assertTrue(properties.isEmpty());

		// Add two new properties
		shape.setProperty("test", 0);
		shape.setProperty("test2", 0);

		// The properties should now have two names: one for each of the ones
		// just added
		properties = shape.getPropertyNames();
		assertEquals(2, properties.size());
		assertTrue(properties.contains("test"));
		assertTrue(properties.contains("test2"));
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.january.geometry.Shape#getProperty(java.lang.String)
	 * <em>Get Property</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.january.geometry.Shape#getProperty(java.lang.String)
	 * @generated NOT
	 */
	public void testGetProperty__String() {

		// The shape for testing
		Shape shape = GeometryFactory.eINSTANCE.createShape();

		// Set some properties for the shape
		shape.setProperty("test", 1);
		shape.setProperty("test2", 2);

		// Get the properties and check that they are equal
		assertEquals(1, shape.getProperty("test"));
		assertEquals(2, shape.getProperty("test2"));
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.january.geometry.Shape#setProperty(java.lang.String, double)
	 * <em>Set Property</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.january.geometry.Shape#setProperty(java.lang.String,
	 *      double)
	 * @generated NOT
	 */
	public void testSetProperty__String_double() {
		// Nothing to do here. See testGetProperty__String() instead.
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.january.geometry.INode#changeDecoratorProperty(java.lang.String, java.lang.Object)
	 * <em>Change Decorator Property</em>}' operation. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.january.geometry.INode#changeDecoratorProperty(java.lang.String,
	 *      java.lang.Object)
	 * @generated NOT
	 */
	public void testChangeDecoratorProperty__String_Object() {

		// Whether or not a notification was received
		AtomicBoolean notified = new AtomicBoolean();
		notified.set(false);

		// Add an adapter to check for notifications
		fixture.eAdapters().add(new AdapterImpl() {

			@Override
			public void notifyChanged(Notification notification) {

				// Check that the notification has the right feature ID, the
				// property name as the old value, and the property value as the
				// new value
				if (notification.getFeatureID(
						GeometryFactory.class) == GeometryPackage.INODE___CHANGE_DECORATOR_PROPERTY__STRING_OBJECT
						&& "test".equals(notification.getOldValue())
						&& "value".equals((notification.getNewValue()))) {
					notified.set(true);
				}
			}

		});
		fixture.changeDecoratorProperty("test", "value");

		// Check that the notification was received
		assertTrue(notified.get());
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.january.geometry.INode#addNode(org.eclipse.january.geometry.INode)
	 * <em>Add Node</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.january.geometry.INode#addNode(org.eclipse.january.geometry.INode)
	 * @generated NOT
	 */
	public void testAddNode__INode() {

		// Create two child nodes
		Operator child1 = GeometryFactory.eINSTANCE.createOperator();
		child1.setName("child1");
		Operator child2 = GeometryFactory.eINSTANCE.createOperator();
		child2.setName("child2");

		// Add the children to a test object
		fixture.addNode(child1);
		fixture.addNode(child2);

		// Check that the children are in the nodes list
		assertTrue("child1".equals(fixture.getNodes().get(0).getName()));
		assertTrue("child2".equals(fixture.getNodes().get(1).getName()));

		// Try adding null
		fixture.addNode(null);

		// The list shouldn't have changed
		assertEquals(2, fixture.getNodes().size());

		// Try adding a node that's already in the list
		fixture.addNode(child1);

		// The list shouldn't have changed
		assertEquals(2, fixture.getNodes().size());

		// Remove a child from the list
		fixture.removeNode(child1);

		// Check that the child is now gone
		assertEquals(1, fixture.getNodes().size());
		assertTrue("child2".equals(fixture.getNodes().get(0).getName()));

		// Try removing it again
		fixture.removeNode(child1);

		// The list shouldn't have changed
		assertEquals(1, fixture.getNodes().size());

		// Try removing null
		fixture.removeNode(null);

		// The list shouldn't have changed
		assertEquals(1, fixture.getNodes().size());
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.january.geometry.INode#removeNode(org.eclipse.january.geometry.INode)
	 * <em>Remove Node</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.january.geometry.INode#removeNode(org.eclipse.january.geometry.INode)
	 * @generated NOT
	 */
	public void testRemoveNode__INode() {
		// Nothing to do. See testAddNode_INode() instead.
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.january.geometry.INode#copy(java.lang.Object)
	 * <em>Copy</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.january.geometry.INode#copy(java.lang.Object)
	 * @generated NOT
	 */
	public void testCopy__Object() {

		// Create two shapes
		Shape shape1 = GeometryFactory.eINSTANCE.createShape();
		shape1.setName("shape1");
		Shape shape2 = GeometryFactory.eINSTANCE.createShape();
		shape2.setName("shape2");

		// Add the shapes to the parent
		fixture.addNode(shape1);
		fixture.addNode(shape2);

		// Set the shape's center
		Vertex center = GeometryFactory.eINSTANCE.createVertex();
		center.setX(8d);
		fixture.setCenter(center);

		// Set the shape's data members.
		fixture.setId(1);
		fixture.setName("test");
		fixture.setType("testType");
		fixture.setProperty("testProperty", 4);

		// Set the shape's parent
		Operator parent = GeometryFactory.eINSTANCE.createOperator();
		fixture.setParent(parent);

		// Create a copy
		Shape clone = GeometryFactory.eINSTANCE.createShape();
		clone.copy(fixture);

		// The clone's nodes should have also been cloned
		assertTrue("shape1".equals(clone.getNodes().get(0).getName()));
		assertTrue("shape2".equals(clone.getNodes().get(1).getName()));

		// Check that the operator has the correct center
		assertTrue(8d == clone.getCenter().getX());

		// Check the operator's data members
		assertTrue(1 == clone.getId());
		assertTrue("test".equals(clone.getName()));
		assertTrue("testType".equals(clone.getType()));
		assertTrue("testProperty".equals(clone.getProperty("testProperty")));

		// The clone should not kept a reference to the original's parent
		assertNull(fixture.getParent());

		// Try to copy something that isn't an operator
		fixture.copy("invalid object");

		// Make sure that nothing changed
		assertTrue("shape1".equals(clone.getNodes().get(0).getName()));
		assertTrue("shape2".equals(clone.getNodes().get(1).getName()));

		// Check that the operator has the correct center
		assertTrue(8d == clone.getCenter().getX());

		// Check the operator's data members
		assertTrue(1 == clone.getId());
		assertTrue("test".equals(clone.getName()));
		assertTrue("testType".equals(clone.getType()));
		assertTrue("testProperty".equals(clone.getProperty("testProperty")));
	}

	/**
	 * Tests the '{@link org.eclipse.january.geometry.INode#clone() <em>Clone</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.january.geometry.INode#clone()
	 * @generated
	 */
	public void testClone() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} // ShapeTest
