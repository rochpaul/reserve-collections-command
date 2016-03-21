package unidue.rcc.migration.department.auto;

import java.util.List;

import org.apache.cayenne.PersistentObject;
import org.apache.cayenne.ValueHolder;
import org.apache.cayenne.util.PersistentObjectHolder;
import org.apache.cayenne.util.PersistentObjectList;

import unidue.rcc.migration.department.ropclient.Department;



/**
 * A generated persistent class mapped as "Department" Cayenne entity. It is a good idea to
 * avoid changing this class manually, since it will be overwritten next time code is
 * regenerated. If you need to make any customizations, put them in a subclass.
 */
public abstract class _Department extends PersistentObject {

    public static final String CATEGORY_ID_PROPERTY = "categoryId";
    public static final String DESCRIPTION_PROPERTY = "description";
    public static final String LANG_PROPERTY = "lang";
    public static final String PARENT_ID_PROPERTY = "parentId";
    public static final String TEXT_PROPERTY = "text";
    public static final String PARENT_PROPERTY = "parent";
    public static final String SUBNODES_PROPERTY = "subnodes";

    protected String categoryId;
    protected String description;
    protected String lang;
    protected Integer parentId;
    protected String text;
    protected ValueHolder parent;
    protected List<Department> subnodes;

    public String getCategoryId() {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "categoryId", false);
        }

        return categoryId;
    }
    public void setCategoryId(String categoryId) {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "categoryId", false);
        }

        Object oldValue = this.categoryId;
        // notify objectContext about simple property change
        if(objectContext != null) {
            objectContext.propertyChanged(this, "categoryId", oldValue, categoryId);
        }
        
        this.categoryId = categoryId;
    }

    public String getDescription() {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "description", false);
        }

        return description;
    }
    public void setDescription(String description) {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "description", false);
        }

        Object oldValue = this.description;
        // notify objectContext about simple property change
        if(objectContext != null) {
            objectContext.propertyChanged(this, "description", oldValue, description);
        }
        
        this.description = description;
    }

    public String getLang() {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "lang", false);
        }

        return lang;
    }
    public void setLang(String lang) {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "lang", false);
        }

        Object oldValue = this.lang;
        // notify objectContext about simple property change
        if(objectContext != null) {
            objectContext.propertyChanged(this, "lang", oldValue, lang);
        }
        
        this.lang = lang;
    }

    public Integer getParentId() {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "parentId", false);
        }

        return parentId;
    }
    public void setParentId(Integer parentId) {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "parentId", false);
        }

        Object oldValue = this.parentId;
        // notify objectContext about simple property change
        if(objectContext != null) {
            objectContext.propertyChanged(this, "parentId", oldValue, parentId);
        }
        
        this.parentId = parentId;
    }

    public String getText() {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "text", false);
        }

        return text;
    }
    public void setText(String text) {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "text", false);
        }

        Object oldValue = this.text;
        // notify objectContext about simple property change
        if(objectContext != null) {
            objectContext.propertyChanged(this, "text", oldValue, text);
        }
        
        this.text = text;
    }

    public Department getParent() {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "parent", true);
        } else if (this.parent == null) {
        	this.parent = new PersistentObjectHolder(this, "parent");
		}

        return (Department) parent.getValue();
    }
    public void setParent(Department parent) {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "parent", true);
        } else if (this.parent == null) {
        	this.parent = new PersistentObjectHolder(this, "parent");
		}

        // note how we notify ObjectContext of change BEFORE the object is actually
        // changed... this is needed to take a valid current snapshot
        Object oldValue = this.parent.getValueDirectly();
        if (objectContext != null) {
        	objectContext.propertyChanged(this, "parent", oldValue, parent);
        }
        
        this.parent.setValue(parent);
    }

    public List<Department> getSubnodes() {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "subnodes", true);
        } else if (this.subnodes == null) {
        	this.subnodes = new PersistentObjectList(this, "subnodes");
		}

        return subnodes;
    }
    public void addToSubnodes(Department object) {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "subnodes", true);
        } else if (this.subnodes == null) {
        	this.subnodes = new PersistentObjectList(this, "subnodes");
		}

        this.subnodes.add(object);
    }
    public void removeFromSubnodes(Department object) {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "subnodes", true);
        } else if (this.subnodes == null) {
        	this.subnodes = new PersistentObjectList(this, "subnodes");
		}

        this.subnodes.remove(object);
    }

}
