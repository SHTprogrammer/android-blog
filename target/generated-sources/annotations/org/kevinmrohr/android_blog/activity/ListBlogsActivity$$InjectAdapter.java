// Code generated by dagger-compiler.  Do not edit.
package org.kevinmrohr.android_blog.activity;


import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

/**
 * A {@code Binder<ListBlogsActivity>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 * 
 * Owning the dependency links between {@code ListBlogsActivity} and its
 * dependencies.
 * 
 * Being a {@code Provider<ListBlogsActivity>} and handling creation and
 * preparation of object instances.
 * 
 * Being a {@code MembersInjector<ListBlogsActivity>} and handling injection
 * of annotated fields.
 */
public final class ListBlogsActivity$$InjectAdapter extends Binding<ListBlogsActivity>
    implements Provider<ListBlogsActivity>, MembersInjector<ListBlogsActivity> {
  private Binding<org.codehaus.jackson.map.ObjectMapper> mapper;

  public ListBlogsActivity$$InjectAdapter() {
    super("org.kevinmrohr.android_blog.activity.ListBlogsActivity", "members/org.kevinmrohr.android_blog.activity.ListBlogsActivity", NOT_SINGLETON, ListBlogsActivity.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    mapper = (Binding<org.codehaus.jackson.map.ObjectMapper>) linker.requestBinding("org.codehaus.jackson.map.ObjectMapper", ListBlogsActivity.class, getClass().getClassLoader());
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
    injectMembersBindings.add(mapper);
  }

  /**
   * Returns the fully provisioned instance satisfying the contract for
   * {@code Provider<ListBlogsActivity>}.
   */
  @Override
  public ListBlogsActivity get() {
    ListBlogsActivity result = new ListBlogsActivity();
    injectMembers(result);
    return result;
  }

  /**
   * Injects any {@code @Inject} annotated fields in the given instance,
   * satisfying the contract for {@code Provider<ListBlogsActivity>}.
   */
  @Override
  public void injectMembers(ListBlogsActivity object) {
    object.mapper = mapper.get();
  }
}