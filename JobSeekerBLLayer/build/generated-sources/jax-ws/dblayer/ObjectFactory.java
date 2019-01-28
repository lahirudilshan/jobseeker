
package dblayer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dblayer package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UpdateUser_QNAME = new QName("http://DBLayer/", "updateUser");
    private final static QName _UsersSearchByRoleIdResponse_QNAME = new QName("http://DBLayer/", "usersSearchByRoleIdResponse");
    private final static QName _CreateUserResponse_QNAME = new QName("http://DBLayer/", "createUserResponse");
    private final static QName _GetAllUsers_QNAME = new QName("http://DBLayer/", "getAllUsers");
    private final static QName _SearchUserByIdResponse_QNAME = new QName("http://DBLayer/", "searchUserByIdResponse");
    private final static QName _DeleteUserResponse_QNAME = new QName("http://DBLayer/", "deleteUserResponse");
    private final static QName _UpdateUserResponse_QNAME = new QName("http://DBLayer/", "updateUserResponse");
    private final static QName _Hello_QNAME = new QName("http://DBLayer/", "hello");
    private final static QName _SearchUserById_QNAME = new QName("http://DBLayer/", "searchUserById");
    private final static QName _CreateUser_QNAME = new QName("http://DBLayer/", "createUser");
    private final static QName _UsersSearchByRoleId_QNAME = new QName("http://DBLayer/", "usersSearchByRoleId");
    private final static QName _DeleteUser_QNAME = new QName("http://DBLayer/", "deleteUser");
    private final static QName _HelloResponse_QNAME = new QName("http://DBLayer/", "helloResponse");
    private final static QName _GetAllUsersResponse_QNAME = new QName("http://DBLayer/", "getAllUsersResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dblayer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchUserByIdResponse }
     * 
     */
    public SearchUserByIdResponse createSearchUserByIdResponse() {
        return new SearchUserByIdResponse();
    }

    /**
     * Create an instance of {@link GetAllUsers }
     * 
     */
    public GetAllUsers createGetAllUsers() {
        return new GetAllUsers();
    }

    /**
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
    }

    /**
     * Create an instance of {@link UsersSearchByRoleIdResponse }
     * 
     */
    public UsersSearchByRoleIdResponse createUsersSearchByRoleIdResponse() {
        return new UsersSearchByRoleIdResponse();
    }

    /**
     * Create an instance of {@link UpdateUser }
     * 
     */
    public UpdateUser createUpdateUser() {
        return new UpdateUser();
    }

    /**
     * Create an instance of {@link GetAllUsersResponse }
     * 
     */
    public GetAllUsersResponse createGetAllUsersResponse() {
        return new GetAllUsersResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link DeleteUser }
     * 
     */
    public DeleteUser createDeleteUser() {
        return new DeleteUser();
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }

    /**
     * Create an instance of {@link UsersSearchByRoleId }
     * 
     */
    public UsersSearchByRoleId createUsersSearchByRoleId() {
        return new UsersSearchByRoleId();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link SearchUserById }
     * 
     */
    public SearchUserById createSearchUserById() {
        return new SearchUserById();
    }

    /**
     * Create an instance of {@link UpdateUserResponse }
     * 
     */
    public UpdateUserResponse createUpdateUserResponse() {
        return new UpdateUserResponse();
    }

    /**
     * Create an instance of {@link DeleteUserResponse }
     * 
     */
    public DeleteUserResponse createDeleteUserResponse() {
        return new DeleteUserResponse();
    }

    /**
     * Create an instance of {@link Country }
     * 
     */
    public Country createCountry() {
        return new Country();
    }

    /**
     * Create an instance of {@link UserRoles }
     * 
     */
    public UserRoles createUserRoles() {
        return new UserRoles();
    }

    /**
     * Create an instance of {@link Appoinment }
     * 
     */
    public Appoinment createAppoinment() {
        return new Appoinment();
    }

    /**
     * Create an instance of {@link Shedule }
     * 
     */
    public Shedule createShedule() {
        return new Shedule();
    }

    /**
     * Create an instance of {@link JobType }
     * 
     */
    public JobType createJobType() {
        return new JobType();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DBLayer/", name = "updateUser")
    public JAXBElement<UpdateUser> createUpdateUser(UpdateUser value) {
        return new JAXBElement<UpdateUser>(_UpdateUser_QNAME, UpdateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsersSearchByRoleIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DBLayer/", name = "usersSearchByRoleIdResponse")
    public JAXBElement<UsersSearchByRoleIdResponse> createUsersSearchByRoleIdResponse(UsersSearchByRoleIdResponse value) {
        return new JAXBElement<UsersSearchByRoleIdResponse>(_UsersSearchByRoleIdResponse_QNAME, UsersSearchByRoleIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DBLayer/", name = "createUserResponse")
    public JAXBElement<CreateUserResponse> createCreateUserResponse(CreateUserResponse value) {
        return new JAXBElement<CreateUserResponse>(_CreateUserResponse_QNAME, CreateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DBLayer/", name = "getAllUsers")
    public JAXBElement<GetAllUsers> createGetAllUsers(GetAllUsers value) {
        return new JAXBElement<GetAllUsers>(_GetAllUsers_QNAME, GetAllUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchUserByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DBLayer/", name = "searchUserByIdResponse")
    public JAXBElement<SearchUserByIdResponse> createSearchUserByIdResponse(SearchUserByIdResponse value) {
        return new JAXBElement<SearchUserByIdResponse>(_SearchUserByIdResponse_QNAME, SearchUserByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DBLayer/", name = "deleteUserResponse")
    public JAXBElement<DeleteUserResponse> createDeleteUserResponse(DeleteUserResponse value) {
        return new JAXBElement<DeleteUserResponse>(_DeleteUserResponse_QNAME, DeleteUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DBLayer/", name = "updateUserResponse")
    public JAXBElement<UpdateUserResponse> createUpdateUserResponse(UpdateUserResponse value) {
        return new JAXBElement<UpdateUserResponse>(_UpdateUserResponse_QNAME, UpdateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DBLayer/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchUserById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DBLayer/", name = "searchUserById")
    public JAXBElement<SearchUserById> createSearchUserById(SearchUserById value) {
        return new JAXBElement<SearchUserById>(_SearchUserById_QNAME, SearchUserById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DBLayer/", name = "createUser")
    public JAXBElement<CreateUser> createCreateUser(CreateUser value) {
        return new JAXBElement<CreateUser>(_CreateUser_QNAME, CreateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsersSearchByRoleId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DBLayer/", name = "usersSearchByRoleId")
    public JAXBElement<UsersSearchByRoleId> createUsersSearchByRoleId(UsersSearchByRoleId value) {
        return new JAXBElement<UsersSearchByRoleId>(_UsersSearchByRoleId_QNAME, UsersSearchByRoleId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DBLayer/", name = "deleteUser")
    public JAXBElement<DeleteUser> createDeleteUser(DeleteUser value) {
        return new JAXBElement<DeleteUser>(_DeleteUser_QNAME, DeleteUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DBLayer/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DBLayer/", name = "getAllUsersResponse")
    public JAXBElement<GetAllUsersResponse> createGetAllUsersResponse(GetAllUsersResponse value) {
        return new JAXBElement<GetAllUsersResponse>(_GetAllUsersResponse_QNAME, GetAllUsersResponse.class, null, value);
    }

}
