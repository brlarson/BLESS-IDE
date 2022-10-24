//TraverseBlessWorkspace.java

package com.multitude.aadl.bless.util;

import java.util.HashSet;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

public class TraverseBlessWorkspace
  {

  public static String SOURCE_FILE_EXT = "aadl";

  public static HashSet<IFile> 
getAadlFilesInWorkspace() {
  HashSet<IFile> result = new HashSet<IFile>();
  getFiles(getProjects(), result, SOURCE_FILE_EXT);
  return result;
}
  
  
  private static IProject[] 
getProjects() {
  IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();

  IProject[] tmp = new IProject[projects.length];

  int cn = 0;
  for (int i = 0, max = projects.length; i < max; i++) {
    IProject project = projects[i];
    if (project.isOpen()) // || projectIsContributedByBless(project)) 
      tmp[cn++] = project;
  }
  return tmp;
}

//  private static boolean projectIsContributedByBless(IProject project)
//    {
//    if ((project != null) && (project.getFullPath() != null) && 
//        (project.getFullPath().lastSegment().endsWith("Units")) || project.getFullPath().lastSegment().endsWith("Typedef"))
//      return true;
//    else
//      return false;
//    }
    
  private static HashSet<IFile> getFiles(IResource[] resources, HashSet<IFile> result, String extension) {
  try 
    {
    for (int i = 0; i < resources.length; i++) 
      {
      if (resources[i] instanceof IFile) 
        {
        IFile file = (IFile) resources[i];
        String ext = file.getFileExtension();
        if (ext != null) 
          if (extension.equalsIgnoreCase(SOURCE_FILE_EXT)
              && ext.equalsIgnoreCase(SOURCE_FILE_EXT)) 
            result.add((IFile) resources[i]);
        }
      else if (resources[i] instanceof IContainer) 
        {
        IContainer cont = (IContainer) resources[i];
        if (!cont.getName().startsWith(".")) 
          getFiles(cont.members(), result, extension);
        }
      }
    } catch (CoreException e) {
//    log(e);
  }
  //platform:/plugin/com.multitude.aadl.bless/resources/packages/BLESS_Types.aadl, platform:/plugin/com.multitude.aadl.bless/resources/properties/BLESS_Properties.aadl, platform:/plugin/com.multitude.aadl.bless/resources/properties/BLESS.aadl, platform:/plugin/com.multitude.aadl.bless/resources/packages/SI.aadl
//  IFile[] files = ResourcesPlugin
//      .getWorkspace()
//      .getRoot().findFilesForLocationURI(java.net.URI.create("/plugin/com.multitude.aadl.bless/resources/packages/SI.aadl"));
//  for (IFile f2 : files)
//     result.add(f2);

  //get contributed AADL
//  List<URI> contributed =  PredeclaredProperties.getContributedResources();  // PluginSupportUtil.getContributedAadl();
//  
//  for (URI f : contributed)
//    if ((f.lastSegment() == "SI.aadl") || (f.lastSegment() == "BLESS_Types.aadl") )
//    {
//    IFile[] files = ResourcesPlugin
//        .getWorkspace()
//        .getRoot().findFilesForLocationURI(java.net.URI.create(f.toFileString()));
//    for (IFile f2 : files)
//    result.add(f2);
//    }
  
  return result;
}

  }
