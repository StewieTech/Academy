CREATE TABLE "studentAudit"(
   "studentId" INT NOT NULL,
   "studentEnrolledDate" TIMESTAMP NOT NULL
);

-- Run the following code to define the function (aka procedure) auditStudentFunc:
CREATE OR REPLACE FUNCTION auditStudentFunc() RETURNS TRIGGER AS $$
   BEGIN
      INSERT INTO "studentAudit"("studentId", "studentEnrolledDate") VALUES (new."studentId", current_timestamp);
      RETURN NEW;
   END;
$$ LANGUAGE plpgsql;

-- Create the trigger "auditTrigger," which will utilize the logic we wrote for the auditStudentFunc procedure:
CREATE TRIGGER "auditTrigger" AFTER INSERT ON "students"
FOR EACH ROW EXECUTE PROCEDURE auditStudentFunc();

-- See a list of all the triggers
select event_object_schema as table_schema,
       event_object_table as table_name,
       trigger_schema,
       trigger_name,
       string_agg(event_manipulation, ',') as event,
       action_timing as activation,
       action_condition as condition,
       action_statement as definition
from information_schema.triggers
group by 1,2,3,4,6,7,8
order by table_schema,
         table_name;